package com.inpowered.task.service.info;

public class SentimentAnalysisInfo {
    private String polarity;

    private String subjectivity;

    private String text;

    private double polarityConfidence;

    private double subjectivityConfidence;

    SentimentAnalysisInfo(String polarity, String subjectivity, String text, double polarityConfidence, double subjectivityConfidence) {
        this.polarity = polarity;
        this.subjectivity = subjectivity;
        this.text = text;
        this.polarityConfidence = polarityConfidence;
        this.subjectivityConfidence = subjectivityConfidence;
    }

    public String getPolarity() {
        return polarity;
    }

    public String getSubjectivity() {
        return subjectivity;
    }

    public String getText() {
        return text;
    }

    public double getPolarityConfidence() {
        return polarityConfidence;
    }

    public double getSubjectivityConfidence() {
        return subjectivityConfidence;
    }
}
