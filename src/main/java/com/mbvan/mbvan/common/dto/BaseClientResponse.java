package com.mbvan.mbvan.common.dto;

public class BaseClientResponse implements ClientResponseWithHeader{

	private ClientResponseHeader responseHeader = new ClientResponseHeader();


	@Override
	public ClientResponseHeader getResponseHeader() {
		return responseHeader;
	}

	@Override
	public void setResponseHeader(ClientResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
		
	}
}
