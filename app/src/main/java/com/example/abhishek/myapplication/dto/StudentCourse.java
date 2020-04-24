
package com.example.abhishek.myapplication.dto;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class StudentCourse {

    @SerializedName("branchId")
    private Long mBranchId;
    @SerializedName("branchName")
    private String mBranchName;
    @SerializedName("courseId")
    private Long mCourseId;
    @SerializedName("courseName")
    private String mCourseName;
    @SerializedName("id")
    private Long mId;
    @SerializedName("semester")
    private Long mSemester;
    @SerializedName("year")
    private Long mYear;

    public Long getBranchId() {
        return mBranchId;
    }

    public void setBranchId(Long branchId) {
        mBranchId = branchId;
    }

    public String getBranchName() {
        return mBranchName;
    }

    public void setBranchName(String branchName) {
        mBranchName = branchName;
    }

    public Long getCourseId() {
        return mCourseId;
    }

    public void setCourseId(Long courseId) {
        mCourseId = courseId;
    }

    public String getCourseName() {
        return mCourseName;
    }

    public void setCourseName(String courseName) {
        mCourseName = courseName;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getSemester() {
        return mSemester;
    }

    public void setSemester(Long semester) {
        mSemester = semester;
    }

    public Long getYear() {
        return mYear;
    }

    public void setYear(Long year) {
        mYear = year;
    }

}
