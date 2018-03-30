package com.inpowered.task.service.impl;

import com.inpowered.task.facade.data.ResultData;
import com.inpowered.task.service.PostParseResultService;
import org.springframework.stereotype.Component;

@Component
public class PostParseResultServiceImpl implements PostParseResultService {
    @Override
    public void postParseResultSuccess(String callbackUrl, ResultData resultData) {
        //TODO post success result data to callbackUrl
    }

    @Override
    public void postParseResultFailure(String callbackUrl, String url) {
        //TODO post failure message of processing url to callbackUrl
    }
}
