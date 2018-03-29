package com.inpowered.task.facade.converter.out;

import com.inpowered.task.dao.model.Bookmark;
import com.inpowered.task.facade.data.BookmarkData;

import java.util.function.Function;

public enum  BookmarkToBookmarkDataConverter implements Function<Bookmark, BookmarkData> {
    INST;
    @Override
    public BookmarkData apply(Bookmark bookmark) {
        return new BookmarkData(bookmark.getId(),
                bookmark.getName(),
                bookmark.getDescription());
    }
}
