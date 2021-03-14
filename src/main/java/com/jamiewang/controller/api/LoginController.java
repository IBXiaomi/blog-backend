package com.jamiewang.controller.api;

import com.jamiewang.common.LoginRequest;
import com.jamiewang.common.admin.Response;
import com.jamiewang.service.login.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/jamie/login")
public class LoginController {

    LoginService loginService;

    @PostMapping("")
    public Response loginToSystem(LoginRequest request) {
        return loginService.loginToSystem(request);
    }
}
