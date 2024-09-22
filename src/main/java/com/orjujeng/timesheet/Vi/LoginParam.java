package com.orjujeng.timesheet.Vi;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class LoginParam implements Serializable {
    public LoginParam(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Email
    private String email;
    @Size(min = 7, max = 7)
    private String password;

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
}
