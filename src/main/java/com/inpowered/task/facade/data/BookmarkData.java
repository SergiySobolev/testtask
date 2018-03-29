package com.inpowered.task.facade.data;

public class BookmarkData {
    private Long id;

    private String name;

    private String description;

    public BookmarkData() {

    }

    public BookmarkData(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
}
