package com.example.randomuser.service.api;

import com.example.randomuser.model.UserResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface UserApi {

    @GET(".")
    Observable<UserResponse> getUser();

    @GET("large")
    Observable<UserResponse> getImage();
}
