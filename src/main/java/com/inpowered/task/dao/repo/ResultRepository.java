package com.inpowered.task.dao.repo;

import com.inpowered.task.dao.model.Result;

public interface ResultRepository {
    Result findResultByUrl(String url);
    void save(Result request);
}
