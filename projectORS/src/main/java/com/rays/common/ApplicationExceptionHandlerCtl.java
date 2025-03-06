package com.rays.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Handles application propagated exceptions
 * 
 * Rohit Rajput 
 *
 */


@ControllerAdvice // handle exception globally
public class ApplicationExceptionHandlerCtl {

	@ExceptionHandler(value = RuntimeException.class) // custom exception handle
	public ORSResponse handleRuntimeException(RuntimeException e) {
		ORSResponse res = new ORSResponse(false);
		res.addMessage(e.getMessage() + "Rohit Rajput");
		return res;
	}

}
