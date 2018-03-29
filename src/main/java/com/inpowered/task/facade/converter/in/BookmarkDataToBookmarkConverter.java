package com.inpowered.task.facade.converter.in;

import com.inpowered.task.dao.model.Bookmark;
import com.inpowered.task.facade.data.BookmarkData;

import java.util.function.Function;

public enum BookmarkDataToBookmarkConverter implements Function<BookmarkData, Bookmark> {
    INST;
    @Override
    public Bookmark apply(BookmarkData bookmarkData) {
        return new Bookmark(bookmarkData.getName(),
                bookmarkData.getDescription());
    }
}
