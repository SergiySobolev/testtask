package com.inpowered.task.service.info;

public class PageInfoBuilder {
    private String pageTitle;
    private String description;
    private String author;

    public PageInfoBuilder setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
        return this;
    }

    public PageInfoBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public PageInfoBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public PageInfo createPageInfo() {
        return new PageInfo(pageTitle, description, author);
    }
}