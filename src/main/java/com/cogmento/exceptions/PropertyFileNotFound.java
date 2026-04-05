package com.cogmento.exceptions;

public class PropertyFileNotFound extends RuntimeException {

	public PropertyFileNotFound() {

	}

	public PropertyFileNotFound(String message) {
		super(message);
	}
}
