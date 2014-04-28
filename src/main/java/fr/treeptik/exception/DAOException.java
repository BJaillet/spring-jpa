package fr.treeptik.exception;

import java.io.Serializable;

public class DAOException extends Exception implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public DAOException(String message, Throwable error) {
		super(message, error);
	}
	
}
