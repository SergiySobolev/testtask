package com.inpowered.task.service;


import com.inpowered.task.dao.model.Result;

public interface ResultService {
    Result findResultByUrl(String url);
    void addResult(Result result);
}
