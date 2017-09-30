package com.abunchtell.writeas.models;

import com.google.gson.annotations.SerializedName;

public class ResponseEnvelope<T> {
    private int code;
    @SerializedName("error_msg")
    private String errorMsg;
    private T data;

    public int getCode() {
        return code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public T getData() {
        return data;
    }
}
