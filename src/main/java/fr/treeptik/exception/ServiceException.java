package fr.treeptik.exception;

import java.io.Serializable;

public class ServiceException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	public ServiceException(String message, Throwable error) {
		super(message, error);
	}

}
