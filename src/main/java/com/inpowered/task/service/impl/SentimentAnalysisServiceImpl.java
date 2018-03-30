package com.inpowered.task.service.impl;

import com.inpowered.task.facade.data.RequestData;
import com.inpowered.task.service.SentimentAnalysisService;
import com.inpowered.task.service.info.PageInfoBuilder;
import com.inpowered.task.service.info.SentimentAnalysisInfo;
import com.inpowered.task.service.info.SentimentAnalysisInfoBuilder;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SentimentAnalysisServiceImpl implements SentimentAnalysisService {
    @Override
    public SentimentAnalysisInfo getSentimentAnalysis(RequestData request) {
        //TODO do request to aylien.com
        return new SentimentAnalysisInfoBuilder()
                .setPolarity("Mock Polarity_" + new Random().nextInt())
                .setPolarityConfidence(new Random().nextDouble())
                .setSubjectivity("Mock Subjectivity_" + new Random().nextInt())
                .setSubjectivityConfidence(new Random().nextDouble())
                .setText("Mock text_" + new Random().nextInt())
                .createSentimentAnalysisInfo();
    }
}
