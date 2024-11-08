package com.mbvan.mbvan.common.exception;

public class CVCServiceException extends RuntimeException{

	private static final long serialVersionUID = 1021920481400295570L;

	private String errorCode;
	
	public CVCServiceException() {
		super();
	}

	public CVCServiceException(String errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public CVCServiceException(Throwable cause) {
		super(cause);
	}

	public CVCServiceException(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
}
