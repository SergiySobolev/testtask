package com.inpowered.task.dao.repo;

import com.inpowered.task.dao.model.Bookmark;

import java.util.List;

public interface BookmarkRepository {
    List<Bookmark> findAllBookmarks();
    void save(Bookmark bookmark);
}
