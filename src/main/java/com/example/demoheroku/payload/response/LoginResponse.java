package com.example.demoheroku.payload.response;

import javax.servlet.http.Cookie;
import javax.validation.constraints.NotBlank;

public class LoginResponse {

    @NotBlank
    private String fullName;
    private String message;

    private Cookie cookie;


    public LoginResponse() {
    }

    public LoginResponse(String message) {
        this.message = message;
    }

    public LoginResponse(String fullName, Cookie cookie) {
        this.fullName = fullName;

        this.cookie = cookie;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
