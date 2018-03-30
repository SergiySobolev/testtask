package com.inpowered.task.facade.impl;

import com.inpowered.task.facade.ResultFacade;
import com.inpowered.task.facade.converter.in.ResultDataToResultConverter;
import com.inpowered.task.facade.converter.out.ResultToResultDataConverter;
import com.inpowered.task.facade.data.RequestData;
import com.inpowered.task.facade.data.ResultData;
import com.inpowered.task.service.PageInfoService;
import com.inpowered.task.service.PostParseResultService;
import com.inpowered.task.service.ResultService;
import com.inpowered.task.service.SentimentAnalysisService;
import com.inpowered.task.service.info.PageInfo;
import com.inpowered.task.service.info.SentimentAnalysisInfo;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.*;

import static java.util.Optional.ofNullable;

@Component
public class ResultFacadeImpl implements ResultFacade {

    private ResultService resultService;

    private PostParseResultService postParseResultService;

    private PageInfoService pageInfoService;

    private SentimentAnalysisService sentimentAnalysisService;

    public ResultFacadeImpl(ResultService resultService, PostParseResultService postParseResultService, PageInfoService pageInfoService, SentimentAnalysisService sentimentAnalysisService) {
        this.resultService = resultService;
        this.postParseResultService = postParseResultService;
        this.pageInfoService = pageInfoService;
        this.sentimentAnalysisService = sentimentAnalysisService;
    }

    @Override
    public Optional<ResultData> parseRequest(RequestData data) {
        Optional<ResultData> pageInfoAndSentimentInfo = getPageInfoAndSentimentInfo(data);
        pageInfoAndSentimentInfo.ifPresent(resultData -> resultService.addResult(ResultDataToResultConverter.INST.apply(resultData)));
        return pageInfoAndSentimentInfo;
    }

    @Override
    public void parseRequestAsync(RequestData data) {
        Runnable parseAndSendToCallbackUrlTask = () -> parseAndSendToCallbackUrl(data);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(parseAndSendToCallbackUrlTask);
    }

    private void parseAndSendToCallbackUrl(RequestData data) {
        Optional<ResultData> pageInfoAndSentimentInfo = getPageInfoAndSentimentInfo(data);
        if(pageInfoAndSentimentInfo.isPresent()) {
            postParseResultService.postParseResultSuccess(data.getCallbackUrl(), pageInfoAndSentimentInfo.get());
        } else {
            postParseResultService.postParseResultFailure(data.getCallbackUrl(), data.getUrl());
        }
    }

    private Optional<ResultData> getPageInfoAndSentimentInfo(RequestData data) {
        Callable<PageInfo> pageInfoTask = () -> pageInfoService.getPageInfo(data);
        Callable<SentimentAnalysisInfo> sentimentAnalysisInfoTask = () -> sentimentAnalysisService.getSentimentAnalysis(data);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<PageInfo> pageInfoFuture = executor.submit(pageInfoTask);
        Future<SentimentAnalysisInfo> sentimentAnalysisInfoFuture = executor.submit(sentimentAnalysisInfoTask);
        try {
            ResultData resultData = new ResultData(data.getUrl(), pageInfoFuture.get(), sentimentAnalysisInfoFuture.get());
            return Optional.of(resultData);
        } catch (InterruptedException|ExecutionException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<ResultData> findResultByUrl(String url) {
        return ofNullable(ResultToResultDataConverter.INST
                .apply(resultService.findResultByUrl(url)));
    }


}
