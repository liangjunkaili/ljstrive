package com.liangjun.strive.bean;

import java.io.Serializable;

public class User implements Serializable {
    private String userphone;
    private String username;

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
