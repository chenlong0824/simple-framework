package org.cl.web.model;

/**
 * Project: simple-framework
 * Package: org.cl.web.model
 *
 * @author : LChen
 * @date : 2018/9/9 14:59
 * @description
 */
public class User {

    private int userId;

    private String username;

    private String userEmail;

    public User(int userId, String username, String userEmail) {
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
