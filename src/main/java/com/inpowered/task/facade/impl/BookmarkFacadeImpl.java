package com.inpowered.task.facade.impl;

import com.inpowered.task.facade.BookmarkFacade;
import com.inpowered.task.facade.converter.in.BookmarkDataToBookmarkConverter;
import com.inpowered.task.facade.converter.out.BookmarkToBookmarkDataConverter;
import com.inpowered.task.facade.data.BookmarkData;
import com.inpowered.task.service.BookmarkService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookmarkFacadeImpl implements BookmarkFacade {

    private BookmarkService bookmarkService;

    public BookmarkFacadeImpl(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    @Override
    public List<BookmarkData> findAllBookmarks() {
        return bookmarkService.findAllBookmarks().stream()
                .map(BookmarkToBookmarkDataConverter.INST)
                .collect(Collectors.toList());
    }

    @Override
    public void addBookmark(BookmarkData bookmarkData) {
        bookmarkService.addBookmark(BookmarkDataToBookmarkConverter.INST.apply(bookmarkData));
    }
}
