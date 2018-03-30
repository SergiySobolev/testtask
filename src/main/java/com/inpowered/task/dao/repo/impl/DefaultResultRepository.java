package com.inpowered.task.dao.repo.impl;

import com.inpowered.task.dao.model.Result;
import com.inpowered.task.dao.repo.ResultRepository;
import com.inpowered.task.dao.repo.impl.jpa.JpaResultRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultResultRepository implements ResultRepository {

    private final JpaResultRepository jpaResultRepository;

    public DefaultResultRepository(JpaResultRepository jpaResultRepository) {
        this.jpaResultRepository = jpaResultRepository;
    }

    @Override
    public Result findResultByUrl(String url) {
        return jpaResultRepository.findResultByUrl(url);
    }

    @Override
    public void save(Result result) {
        jpaResultRepository.save(result);
    }
}
