package com.inpowered.task.service.info;

public class SentimentAnalysisInfoBuilder {
    private String polarity;
    private String subjectivity;
    private String text;
    private double polarityConfidence;
    private double subjectivityConfidence;

    public SentimentAnalysisInfoBuilder setPolarity(String polarity) {
        this.polarity = polarity;
        return this;
    }

    public SentimentAnalysisInfoBuilder setSubjectivity(String subjectivity) {
        this.subjectivity = subjectivity;
        return this;
    }

    public SentimentAnalysisInfoBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public SentimentAnalysisInfoBuilder setPolarityConfidence(double polarityConfidence) {
        this.polarityConfidence = polarityConfidence;
        return this;
    }

    public SentimentAnalysisInfoBuilder setSubjectivityConfidence(double subjectivityConfidence) {
        this.subjectivityConfidence = subjectivityConfidence;
        return this;
    }

    public SentimentAnalysisInfo createSentimentAnalysisInfo() {
        return new SentimentAnalysisInfo(polarity, subjectivity, text, polarityConfidence, subjectivityConfidence);
    }
}