package com.greenfox.frontendexcercise.model;

public class AppendA {
    private String appended;

    public AppendA(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String word) {
        this.appended = appended;
    }
}
