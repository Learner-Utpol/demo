package com.example.conslayout;

public class User {
    private String userId;
    private String email;
    private String password;
    private String phoneNum;

    public User() {
    }

    public User(String userId, String email, String password, String phoneNum) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
