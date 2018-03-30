package com.inpowered.task.service.info;


public class PageInfo {
    private String pageTitle;

    private String description;

    private String author;

    PageInfo(String pageTitle, String description, String author) {
        this.pageTitle = pageTitle;
        this.description = description;
        this.author = author;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
