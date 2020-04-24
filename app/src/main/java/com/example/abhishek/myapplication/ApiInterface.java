package com.example.abhishek.myapplication;

import com.example.abhishek.myapplication.dto.DashboardResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/v1/home")
    Call<DashboardResponse> getDashboard();
}
