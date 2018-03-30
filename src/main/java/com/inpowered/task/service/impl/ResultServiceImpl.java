package com.inpowered.task.service.impl;

import com.inpowered.task.dao.model.Result;
import com.inpowered.task.dao.repo.ResultRepository;
import com.inpowered.task.service.ResultService;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

    private final ResultRepository resultRepository;

    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public Result findResultByUrl(String url) {
        return resultRepository.findResultByUrl(url);
    }

    @Override
    public void addResult(Result result) {
        resultRepository.save(result);
    }
}
