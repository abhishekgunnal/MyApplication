
package com.example.abhishek.myapplication.dto;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Profile {

    @SerializedName("active")
    private Boolean mActive;
    @SerializedName("admin")
    private Boolean mAdmin;
    @SerializedName("collegeName")
    private String mCollegeName;
    @SerializedName("createdDateTime")
    private String mCreatedDateTime;
    @SerializedName("dob")
    private String mDob;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("id")
    private Long mId;
    @SerializedName("isCourseExist")
    private Boolean mIsCourseExist;
    @SerializedName("locality")
    private String mLocality;
    @SerializedName("mobileNumber")
    private String mMobileNumber;
    @SerializedName("name")
    private String mName;
    @SerializedName("paidUser")
    private Boolean mPaidUser;
    @SerializedName("pincode")
    private String mPincode;
    @SerializedName("profilePic")
    private String mProfilePic;
    @SerializedName("referralCode")
    private String mReferralCode;
    @SerializedName("sex")
    private String mSex;
    @SerializedName("subject")
    private Subject mSubject;

    public Boolean getActive() {
        return mActive;
    }

    public void setActive(Boolean active) {
        mActive = active;
    }

    public Boolean getAdmin() {
        return mAdmin;
    }

    public void setAdmin(Boolean admin) {
        mAdmin = admin;
    }

    public String getCollegeName() {
        return mCollegeName;
    }

    public void setCollegeName(String collegeName) {
        mCollegeName = collegeName;
    }

    public String getCreatedDateTime() {
        return mCreatedDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        mCreatedDateTime = createdDateTime;
    }

    public String getDob() {
        return mDob;
    }

    public void setDob(String dob) {
        mDob = dob;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getIsCourseExist() {
        return mIsCourseExist;
    }

    public void setIsCourseExist(Boolean isCourseExist) {
        mIsCourseExist = isCourseExist;
    }

    public String getLocality() {
        return mLocality;
    }

    public void setLocality(String locality) {
        mLocality = locality;
    }

    public String getMobileNumber() {
        return mMobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        mMobileNumber = mobileNumber;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getPaidUser() {
        return mPaidUser;
    }

    public void setPaidUser(Boolean paidUser) {
        mPaidUser = paidUser;
    }

    public String getPincode() {
        return mPincode;
    }

    public void setPincode(String pincode) {
        mPincode = pincode;
    }

    public String getProfilePic() {
        return mProfilePic;
    }

    public void setProfilePic(String profilePic) {
        mProfilePic = profilePic;
    }

    public String getReferralCode() {
        return mReferralCode;
    }

    public void setReferralCode(String referralCode) {
        mReferralCode = referralCode;
    }

    public String getSex() {
        return mSex;
    }

    public void setSex(String sex) {
        mSex = sex;
    }

    public Subject getSubject() {
        return mSubject;
    }

    public void setSubject(Subject subject) {
        mSubject = subject;
    }

}
