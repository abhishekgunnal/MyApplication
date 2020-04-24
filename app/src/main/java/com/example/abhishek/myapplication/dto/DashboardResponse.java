
package com.example.abhishek.myapplication.dto;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class DashboardResponse {

    @SerializedName("data")
    private Data mData;
    @SerializedName("message")
    private String mMessage;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

}
