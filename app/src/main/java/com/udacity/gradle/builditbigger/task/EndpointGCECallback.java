package com.udacity.gradle.builditbigger.task;

public interface EndpointGCECallback<T> {
    public void onSuccess(String result);
    public void onFailure(Exception e);
}
