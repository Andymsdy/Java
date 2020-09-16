package com.chnu.javase.ListDemo;

public class User {
    private String admin;
    private String password;

    public User() {
    }

    public User(String admin, String password) {
        this.admin = admin;
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "admin='" + admin + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

