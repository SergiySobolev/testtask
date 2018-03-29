package com.inpowered.task.dao.repo.impl;

import com.inpowered.task.dao.model.Bookmark;
import com.inpowered.task.dao.repo.BookmarkRepository;
import com.inpowered.task.dao.repo.impl.jpa.JpaBookmarkRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DefaultBookmarkRepository implements BookmarkRepository  {

    private final JpaBookmarkRepository jpaBookmarkRepository;

    public DefaultBookmarkRepository(JpaBookmarkRepository jpaBookmarkRepository) {
        this.jpaBookmarkRepository = jpaBookmarkRepository;
    }

    @Override
    public List<Bookmark> findAllBookmarks() {
        return jpaBookmarkRepository.findAll();
    }

    @Override
    public void save(Bookmark bookmark) {
        jpaBookmarkRepository.save(bookmark);
    }
}
