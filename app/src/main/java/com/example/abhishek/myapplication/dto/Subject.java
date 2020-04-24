
package com.example.abhishek.myapplication.dto;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Subject {

    @SerializedName("branch")
    private String mBranch;
    @SerializedName("branchId")
    private Object mBranchId;
    @SerializedName("common")
    private Boolean mCommon;
    @SerializedName("count")
    private Object mCount;
    @SerializedName("courseName")
    private String mCourseName;
    @SerializedName("createdDateTime")
    private Object mCreatedDateTime;
    @SerializedName("id")
    private Object mId;
    @SerializedName("image")
    private Object mImage;
    @SerializedName("notes")
    private Object mNotes;
    @SerializedName("price")
    private Object mPrice;
    @SerializedName("receiptId")
    private Object mReceiptId;
    @SerializedName("releasingOn")
    private Object mReleasingOn;
    @SerializedName("semester")
    private Long mSemester;
    @SerializedName("subjectName")
    private Object mSubjectName;
    @SerializedName("subscribed")
    private Boolean mSubscribed;
    @SerializedName("updatedDateTime")
    private Object mUpdatedDateTime;
    @SerializedName("year")
    private Long mYear;

    public String getBranch() {
        return mBranch;
    }

    public void setBranch(String branch) {
        mBranch = branch;
    }

    public Object getBranchId() {
        return mBranchId;
    }

    public void setBranchId(Object branchId) {
        mBranchId = branchId;
    }

    public Boolean getCommon() {
        return mCommon;
    }

    public void setCommon(Boolean common) {
        mCommon = common;
    }

    public Object getCount() {
        return mCount;
    }

    public void setCount(Object count) {
        mCount = count;
    }

    public String getCourseName() {
        return mCourseName;
    }

    public void setCourseName(String courseName) {
        mCourseName = courseName;
    }

    public Object getCreatedDateTime() {
        return mCreatedDateTime;
    }

    public void setCreatedDateTime(Object createdDateTime) {
        mCreatedDateTime = createdDateTime;
    }

    public Object getId() {
        return mId;
    }

    public void setId(Object id) {
        mId = id;
    }

    public Object getImage() {
        return mImage;
    }

    public void setImage(Object image) {
        mImage = image;
    }

    public Object getNotes() {
        return mNotes;
    }

    public void setNotes(Object notes) {
        mNotes = notes;
    }

    public Object getPrice() {
        return mPrice;
    }

    public void setPrice(Object price) {
        mPrice = price;
    }

    public Object getReceiptId() {
        return mReceiptId;
    }

    public void setReceiptId(Object receiptId) {
        mReceiptId = receiptId;
    }

    public Object getReleasingOn() {
        return mReleasingOn;
    }

    public void setReleasingOn(Object releasingOn) {
        mReleasingOn = releasingOn;
    }

    public Long getSemester() {
        return mSemester;
    }

    public void setSemester(Long semester) {
        mSemester = semester;
    }

    public Object getSubjectName() {
        return mSubjectName;
    }

    public void setSubjectName(Object subjectName) {
        mSubjectName = subjectName;
    }

    public Boolean getSubscribed() {
        return mSubscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        mSubscribed = subscribed;
    }

    public Object getUpdatedDateTime() {
        return mUpdatedDateTime;
    }

    public void setUpdatedDateTime(Object updatedDateTime) {
        mUpdatedDateTime = updatedDateTime;
    }

    public Long getYear() {
        return mYear;
    }

    public void setYear(Long year) {
        mYear = year;
    }

}
