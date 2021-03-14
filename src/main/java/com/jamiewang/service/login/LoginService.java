package com.jamiewang.service.login;

import com.jamiewang.common.LoginRequest;
import com.jamiewang.common.admin.Response;
import com.jamiewang.common.admin.ResponseConstants;
import com.jamiewang.common.exception.ErrorMessage;
import org.springframework.stereotype.Component;

@Component("loginService")
public class LoginService {

    public Response loginToSystem(LoginRequest request) {
        Response response = new Response();
        if ("jamie".equals(request.getUsername()) && "123".equals(request.getPassword())) {
            response.setMessage(ResponseConstants.LOGIN_SUCCESS);
            response.setStatus("200");
            return response;
        }

        return new Response(ResponseConstants.LOGIN_FAILED, "500",
                new ErrorMessage("username or password error", 500));
    }
}
