package com.example.randomuser.model;

import java.util.List;

public class UserResponse {

    private List<User> results;
    private UserImage image;



    public List<User> getResults() {
        return results;
    }

    public void setResults(List<User> results) {
        this.results = results;
    }

    public UserImage getImage() {
        return image;
    }

    public void setImage(UserImage image) {
        this.image = image;
    }
}
