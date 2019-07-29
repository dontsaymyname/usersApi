package com.example.randomuser.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("picture")
    private UserImage image;
    private Name name;
    private String email;

    public UserImage getImage() {
        return image;
    }

    public void setImage(UserImage image) {
        this.image = image;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
