package com.jamiewang.service.impl;

import com.jamiewang.common.LoginRequest;
import com.jamiewang.common.admin.Response;
import com.jamiewang.common.admin.ResponseConstants;
import com.jamiewang.common.exception.ErrorMessage;
import com.jamiewang.model.User;
import com.jamiewang.repository.UserRepository;
import com.jamiewang.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    private final UserRepository userRepository;

    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public Response loginToSystem(LoginRequest request) {
        Response response = new Response();
        if ("jamie".equals(request.getUsername()) && "123".equals(request.getPassword())) {
            Optional<User> byUsername = userRepository.findByUsername(request.getUsername());
            byUsername.ifPresent(u -> response.setMessage(ResponseConstants.LOGIN_SUCCESS));
            response.setStatus("200");
            return response;
        }

        return new Response(ResponseConstants.LOGIN_FAILED, "500",
                new ErrorMessage("username or password error", 500));
    }
}
