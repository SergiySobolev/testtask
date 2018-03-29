package com.inpowered.task.facade;


import com.inpowered.task.facade.data.BookmarkData;

import java.util.List;

public interface BookmarkFacade {
    List<BookmarkData> findAllBookmarks();
    void addBookmark(BookmarkData bookmarkData);
}
