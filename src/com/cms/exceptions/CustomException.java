package com.cms.exceptions;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = -3444919507214789184L;

	public CustomException(String errorMessage) {
		super(errorMessage);
	}

}
