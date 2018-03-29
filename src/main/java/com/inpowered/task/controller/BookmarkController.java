package com.inpowered.task.controller;

import com.inpowered.task.facade.BookmarkFacade;
import com.inpowered.task.facade.data.BookmarkData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookmarkController {

    private final BookmarkFacade bookmarkFacade;

    public BookmarkController(BookmarkFacade bookmarkFacade) {
        this.bookmarkFacade = bookmarkFacade;
    }

    @RequestMapping(value = "/bookmarks", method = RequestMethod.GET)
    public List<BookmarkData> getAllBookmarks() {
        return bookmarkFacade.findAllBookmarks();
    }

    @RequestMapping(value = "/bookmark", method = RequestMethod.POST)
    public void addBookmark(@RequestBody BookmarkData bookmark) {
        bookmarkFacade.addBookmark(bookmark);
    }
}
