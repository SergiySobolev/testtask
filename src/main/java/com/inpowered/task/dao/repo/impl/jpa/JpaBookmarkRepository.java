package com.inpowered.task.dao.repo.impl.jpa;

import com.inpowered.task.dao.model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBookmarkRepository extends JpaRepository<Bookmark, Long> {
}
