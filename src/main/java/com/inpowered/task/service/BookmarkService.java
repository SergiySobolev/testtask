package com.inpowered.task.service;


import com.inpowered.task.dao.model.Bookmark;

import java.util.List;

public interface BookmarkService {
    List<Bookmark> findAllBookmarks();
    void addBookmark(Bookmark bookmark);
}
