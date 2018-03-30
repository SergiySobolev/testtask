package com.inpowered.task.facade.data;

public class RequestData {
    private Long id;

    private String url;

    private String callbackUrl;

    public RequestData() {

    }

    public RequestData(Long id, String url, String callbackUrl) {
        this.id = id;
        this.url = url;
        this.callbackUrl = callbackUrl;
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
}
