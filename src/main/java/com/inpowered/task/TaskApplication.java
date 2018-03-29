package com.inpowered.task;

import com.inpowered.task.dao.model.Bookmark;
import com.inpowered.task.dao.repo.BookmarkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Bean
	CommandLineRunner init( BookmarkRepository bookmarkRepository) {
		List<String> bookmarks = Arrays.asList("bookmark1", "bookmark2", "bookmark3");
		return (evt) -> bookmarks.forEach(b -> bookmarkRepository.save(new Bookmark(b, b + " desc")));
	}
}
