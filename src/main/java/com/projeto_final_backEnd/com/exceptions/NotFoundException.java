package com.projeto_final_backEnd.com.exceptions;

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID= 1L;
	
	public NotFoundException (String msg) {
		super(msg);
	}

}
