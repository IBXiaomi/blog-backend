package com.jamiewang.common.exception;

/**
 * common return result
 *
 * @author jamiewang
 * @date 03/28/2020
 */
public interface Result {

    String message();

    boolean status();

    int code();

}
