package com.orjujeng.timesheet.Vi;

import jakarta.validation.constraints.Email;

public class ResetParam {
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}