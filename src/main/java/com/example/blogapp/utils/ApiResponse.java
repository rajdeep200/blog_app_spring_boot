package com.example.blogapp.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
    private String message;
    private Boolean success;

    public ApiResponse(String message, Boolean success) {
        this.message = message;
        this.success = success;
    }
}
