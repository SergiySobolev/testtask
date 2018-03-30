package com.inpowered.task.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Result {

    @Id
    @GeneratedValue
    private Long id;

    private String url;

    private String pageTitle;

    private String description;

    private String author;

    private String polarity;

    private String subjectivity;

    private String text;

    private double polarityConfidence;

    private double subjectivityConfidence;

    public Result () {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPolarity() {
        return polarity;
    }

    public void setPolarity(String polarity) {
        this.polarity = polarity;
    }

    public String getSubjectivity() {
        return subjectivity;
    }

    public void setSubjectivity(String subjectivity) {
        this.subjectivity = subjectivity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getPolarityConfidence() {
        return polarityConfidence;
    }

    public void setPolarityConfidence(double polarityConfidence) {
        this.polarityConfidence = polarityConfidence;
    }

    public double getSubjectivityConfidence() {
        return subjectivityConfidence;
    }

    public void setSubjectivityConfidence(double subjectivityConfidence) {
        this.subjectivityConfidence = subjectivityConfidence;
    }
}
