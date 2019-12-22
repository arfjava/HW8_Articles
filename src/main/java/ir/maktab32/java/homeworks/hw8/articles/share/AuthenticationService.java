package ir.maktab32.java.homeworks.hw8.articles.share;

import ir.maktab32.java.homeworks.hw8.articles.entities.User;

public class AuthenticationService {
    private User loginUser;
    private static AuthenticationService authenticationService = null;
    public static AuthenticationService getInstance(){
        if (authenticationService == null)
            authenticationService = new AuthenticationService();
        return authenticationService;
    }

    public User getLoginUser(){
        return loginUser;
    }

    public void setLoginUser(User user){
        this.loginUser = user;
    }

}
