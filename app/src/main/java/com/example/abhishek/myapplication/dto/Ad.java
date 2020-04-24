
package com.example.abhishek.myapplication.dto;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Ad {

    @SerializedName("active")
    private Boolean mActive;
    @SerializedName("adId")
    private Long mAdId;
    @SerializedName("adTitle")
    private String mAdTitle;
    @SerializedName("sequence")
    private Long mSequence;
    @SerializedName("url")
    private String mUrl;

    public Boolean getActive() {
        return mActive;
    }

    public void setActive(Boolean active) {
        mActive = active;
    }

    public Long getAdId() {
        return mAdId;
    }

    public void setAdId(Long adId) {
        mAdId = adId;
    }

    public String getAdTitle() {
        return mAdTitle;
    }

    public void setAdTitle(String adTitle) {
        mAdTitle = adTitle;
    }

    public Long getSequence() {
        return mSequence;
    }

    public void setSequence(Long sequence) {
        mSequence = sequence;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
