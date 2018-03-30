package com.inpowered.task.dao.repo.impl.jpa;

import com.inpowered.task.dao.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JpaResultRepository extends JpaRepository<Result, Long> {
    @Query("SELECT r FROM Result r WHERE r.url = ?1")
    Result findResultByUrl(String url);
}
