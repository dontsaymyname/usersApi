package com.example.randomuser.viewmodel;

import android.app.Application;

import com.example.randomuser.model.User;
import com.example.randomuser.repository.UserRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class UserViewModel extends AndroidViewModel {

    private MutableLiveData<User> userLiveData = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private UserRepository userRepository = new UserRepository();


    public UserViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<User> getUserLiveData (){
        return userLiveData;
    }

    public void atualizarUser (){
        disposable.add(
                userRepository.getUserApi()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(userResponse -> userLiveData.setValue(userResponse))
        );
    }
}
