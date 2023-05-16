package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	/* Permitir que seja instanciado passando uma mensagem*/
	public DomainException(String msg) {
		super(msg);
	}
}
