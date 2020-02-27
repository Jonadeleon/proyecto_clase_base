package com.iesemilidarder.restaurants.web;

public class User {
    //datos del usuario
    private String user;
    private String email;
    private String code;

    public User(String user, String email, String code) {
        this.user = user;
        this.email = email;
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
