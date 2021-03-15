package com.jamiewang.service.login;

import com.jamiewang.common.LoginRequest;
import com.jamiewang.common.admin.Response;
import com.jamiewang.common.admin.ResponseConstants;
import com.jamiewang.service.impl.LoginServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {

    @Mock
    LoginServiceImpl loginService;

    @InjectMocks
    LoginRequest loginRequest;


    @Before
    public void setUp() {
        loginRequest.setUsername("jamie");
        loginRequest.setPassword("123");
    }

    @Test
    public void testLoginToSystem() {
        Mockito.when(loginService.loginToSystem(loginRequest)).thenReturn(new Response("200", ResponseConstants.LOGIN_SUCCESS,
                null));
        Assert.assertEquals(ResponseConstants.LOGIN_SUCCESS, loginService.loginToSystem(loginRequest).getMessage());
    }
}
