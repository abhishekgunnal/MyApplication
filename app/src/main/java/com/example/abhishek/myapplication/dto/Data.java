
package com.example.abhishek.myapplication.dto;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Data {

    @SerializedName("ads")
    private List<Ad> mAds;
    @SerializedName("appDetails")
    private Object mAppDetails;
    @SerializedName("courses")
    private List<Course> mCourses;
    @SerializedName("demoVideos")
    private List<Object> mDemoVideos;
    @SerializedName("profile")
    private Profile mProfile;
    @SerializedName("studentCourse")
    private StudentCourse mStudentCourse;
    @SerializedName("subjects")
    private Object mSubjects;
    @SerializedName("subscribedCourse")
    private List<SubscribedCourse> mSubscribedCourse;
    @SerializedName("subscribedEbooks")
    private List<Object> mSubscribedEbooks;
    @SerializedName("universities")
    private List<University> mUniversities;

    public List<Ad> getAds() {
        return mAds;
    }

    public void setAds(List<Ad> ads) {
        mAds = ads;
    }

    public Object getAppDetails() {
        return mAppDetails;
    }

    public void setAppDetails(Object appDetails) {
        mAppDetails = appDetails;
    }

    public List<Course> getCourses() {
        return mCourses;
    }

    public void setCourses(List<Course> courses) {
        mCourses = courses;
    }

    public List<Object> getDemoVideos() {
        return mDemoVideos;
    }

    public void setDemoVideos(List<Object> demoVideos) {
        mDemoVideos = demoVideos;
    }

    public Profile getProfile() {
        return mProfile;
    }

    public void setProfile(Profile profile) {
        mProfile = profile;
    }

    public StudentCourse getStudentCourse() {
        return mStudentCourse;
    }

    public void setStudentCourse(StudentCourse studentCourse) {
        mStudentCourse = studentCourse;
    }

    public Object getSubjects() {
        return mSubjects;
    }

    public void setSubjects(Object subjects) {
        mSubjects = subjects;
    }

    public List<SubscribedCourse> getSubscribedCourse() {
        return mSubscribedCourse;
    }

    public void setSubscribedCourse(List<SubscribedCourse> subscribedCourse) {
        mSubscribedCourse = subscribedCourse;
    }

    public List<Object> getSubscribedEbooks() {
        return mSubscribedEbooks;
    }

    public void setSubscribedEbooks(List<Object> subscribedEbooks) {
        mSubscribedEbooks = subscribedEbooks;
    }

    public List<University> getUniversities() {
        return mUniversities;
    }

    public void setUniversities(List<University> universities) {
        mUniversities = universities;
    }

}
