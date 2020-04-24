package com.example.abhishek.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.abhishek.myapplication.dto.DashboardResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

   private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();
        apiDashboard();
    }

    private void initUi() {

        txtName = findViewById(R.id.txtName);

    }

    private void apiDashboard() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://5ea2d0c1b9f5ca00166c322a.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        Call<DashboardResponse> dashboardResponseCall = apiInterface.getDashboard();

        dashboardResponseCall.enqueue(new Callback<DashboardResponse>() {
            @Override
            public void onResponse(Call<DashboardResponse> call, Response<DashboardResponse> response) {

                DashboardResponse dashboardResponse = response.body();
                Log.e("api response",""+dashboardResponse.getMessage());

                txtName.setText(dashboardResponse.getData().getProfile().getName());
            }

            @Override
            public void onFailure(Call<DashboardResponse> call, Throwable t) {

            }
        });
    }





}
