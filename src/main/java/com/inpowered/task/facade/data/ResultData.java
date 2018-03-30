package com.inpowered.task.facade.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inpowered.task.service.info.PageInfo;
import com.inpowered.task.service.info.SentimentAnalysisInfo;

public class ResultData {

    @JsonIgnore
    private String url;

    private String pageTitle;

    private String description;

    private String author;

    private String polarity;

    private String subjectivity;

    private String text;

    private double polarityConfidence;

    private double subjectivityConfidence;

    public ResultData() {

    }

    public ResultData(String url, PageInfo pageInfo, SentimentAnalysisInfo sentimentAnalysisInfo) {
        this.url = url;
        this.pageTitle = pageInfo.getPageTitle();
        this.description = pageInfo.getDescription();
        this.author = pageInfo.getAuthor();
        this.polarity = sentimentAnalysisInfo.getPolarity();
        this.polarityConfidence = sentimentAnalysisInfo.getPolarityConfidence();
        this.text = sentimentAnalysisInfo.getText();
        this.subjectivity = sentimentAnalysisInfo.getSubjectivity();
        this.subjectivityConfidence = sentimentAnalysisInfo.getSubjectivityConfidence();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
