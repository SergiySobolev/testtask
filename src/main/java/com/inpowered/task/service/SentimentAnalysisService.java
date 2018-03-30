package com.inpowered.task.service;


import com.inpowered.task.facade.data.RequestData;
import com.inpowered.task.service.info.PageInfo;
import com.inpowered.task.service.info.SentimentAnalysisInfo;

public interface SentimentAnalysisService {
    SentimentAnalysisInfo getSentimentAnalysis(RequestData request);
}
