package com.mbvan.mbvan.common.util;


public class PwdEncryptorException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7342722690998221772L;

	public PwdEncryptorException() {
		super();
	}

	public PwdEncryptorException(String msg) {
		super(msg);
	}

	public PwdEncryptorException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PwdEncryptorException(Throwable cause) {
		super(cause);
	}

}