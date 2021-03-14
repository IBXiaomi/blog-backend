package com.jamiewang.common;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;

    private String password;

    private String verifyCode;


}
