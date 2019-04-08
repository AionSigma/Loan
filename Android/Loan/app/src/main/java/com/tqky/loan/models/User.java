package com.tqky.loan.models;

public class User {
    private String fullName, status, image;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User(String fullName, String status, String image) {
        this.fullName = fullName;
        this.status = status;
        this.image = image;
    }
    public User(String fullName) {
        this.fullName = fullName;
    }

    public User() {}
}
