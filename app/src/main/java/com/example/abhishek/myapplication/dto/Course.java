
package com.example.abhishek.myapplication.dto;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Course {

    @SerializedName("active")
    private Boolean mActive;
    @SerializedName("branches")
    private Object mBranches;
    @SerializedName("createdDateTime")
    private String mCreatedDateTime;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("name")
    private String mName;
    @SerializedName("semester")
    private Long mSemester;
    @SerializedName("uniId")
    private Long mUniId;
    @SerializedName("uniName")
    private String mUniName;
    @SerializedName("updatedDateTime")
    private String mUpdatedDateTime;
    @SerializedName("year")
    private Long mYear;

    public Boolean getActive() {
        return mActive;
    }

    public void setActive(Boolean active) {
        mActive = active;
    }

    public Object getBranches() {
        return mBranches;
    }

    public void setBranches(Object branches) {
        mBranches = branches;
    }

    public String getCreatedDateTime() {
        return mCreatedDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        mCreatedDateTime = createdDateTime;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getSemester() {
        return mSemester;
    }

    public void setSemester(Long semester) {
        mSemester = semester;
    }

    public Long getUniId() {
        return mUniId;
    }

    public void setUniId(Long uniId) {
        mUniId = uniId;
    }

    public String getUniName() {
        return mUniName;
    }

    public void setUniName(String uniName) {
        mUniName = uniName;
    }

    public String getUpdatedDateTime() {
        return mUpdatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
        mUpdatedDateTime = updatedDateTime;
    }

    public Long getYear() {
        return mYear;
    }

    public void setYear(Long year) {
        mYear = year;
    }

}
