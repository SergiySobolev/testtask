package com.inpowered.task.service.impl;

import com.inpowered.task.dao.model.Bookmark;
import com.inpowered.task.dao.repo.BookmarkRepository;
import com.inpowered.task.service.BookmarkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkServiceImpl implements BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkServiceImpl(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    @Override
    public List<Bookmark> findAllBookmarks() {
        return bookmarkRepository.findAllBookmarks();
    }

    @Override
    public void addBookmark(Bookmark bookmark) {
        bookmarkRepository.save(bookmark);
    }
}
