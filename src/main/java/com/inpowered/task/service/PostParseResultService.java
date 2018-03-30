package com.inpowered.task.service;


import com.inpowered.task.facade.data.ResultData;

public interface PostParseResultService {
    void postParseResultSuccess(String callbackUrl, ResultData resultData);
    void postParseResultFailure(String callbackUrl, String url);
}
