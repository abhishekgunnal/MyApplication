
package com.example.abhishek.myapplication.dto;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SubscribedCourse {

    @SerializedName("branch")
    private String mBranch;
    @SerializedName("branchId")
    private Long mBranchId;
    @SerializedName("common")
    private Boolean mCommon;
    @SerializedName("count")
    private String mCount;
    @SerializedName("courseName")
    private Object mCourseName;
    @SerializedName("createdDateTime")
    private Object mCreatedDateTime;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private Object mImage;
    @SerializedName("notes")
    private Object mNotes;
    @SerializedName("price")
    private Long mPrice;
    @SerializedName("receiptId")
    private Object mReceiptId;
    @SerializedName("releasingOn")
    private Object mReleasingOn;
    @SerializedName("semester")
    private Long mSemester;
    @SerializedName("subjectName")
    private String mSubjectName;
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

    public Long getBranchId() {
        return mBranchId;
    }

    public void setBranchId(Long branchId) {
        mBranchId = branchId;
    }

    public Boolean getCommon() {
        return mCommon;
    }

    public void setCommon(Boolean common) {
        mCommon = common;
    }

    public String getCount() {
        return mCount;
    }

    public void setCount(String count) {
        mCount = count;
    }

    public Object getCourseName() {
        return mCourseName;
    }

    public void setCourseName(Object courseName) {
        mCourseName = courseName;
    }

    public Object getCreatedDateTime() {
        return mCreatedDateTime;
    }

    public void setCreatedDateTime(Object createdDateTime) {
        mCreatedDateTime = createdDateTime;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
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

    public Long getPrice() {
        return mPrice;
    }

    public void setPrice(Long price) {
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

    public String getSubjectName() {
        return mSubjectName;
    }

    public void setSubjectName(String subjectName) {
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
