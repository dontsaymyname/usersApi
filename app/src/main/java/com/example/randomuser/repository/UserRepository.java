package com.example.randomuser.repository;

import com.example.randomuser.model.User;
import com.example.randomuser.service.RetrofitService;

import java.util.List;

import io.reactivex.Observable;

public class UserRepository {

    private RetrofitService retrofitService = new RetrofitService();

    public Observable<User> getUserApi () {
        return retrofitService.getUserApi()
                .getUser()
                .map(userResponse -> userResponse.getResults().get(0));
    }

}
