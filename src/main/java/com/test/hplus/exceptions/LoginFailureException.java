package com.test.hplus.exceptions;

import jdk.vm.ci.meta.ExceptionHandler;

public class LoginFailureException extends Exception {
    public LoginFailureException(String message) {
        super(message);
    }
}
