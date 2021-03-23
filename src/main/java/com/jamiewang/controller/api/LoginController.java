package com.jamiewang.controller.api;

import com.jamiewang.common.LoginRequest;
import com.jamiewang.common.admin.Response;
import com.jamiewang.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/jamie")
public class LoginController {

   private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    @CrossOrigin("http://localhost:8080")
    @ResponseBody
    public Response loginToSystem(@RequestBody LoginRequest request) {
        return loginService.loginToSystem(request);
    }
}
