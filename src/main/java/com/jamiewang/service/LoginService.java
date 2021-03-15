package com.jamiewang.service;

import com.jamiewang.common.LoginRequest;
import com.jamiewang.common.admin.Response;

/**
 * login in service
 * author:jamie
 * date:03/15/2021
 */
public interface LoginService {

    /**
     * login in service
     *
     * @param loginRequest request about login
     * @return backend response body
     */
    Response loginToSystem(LoginRequest loginRequest);
}
