package model.exceptions;

public class DomainException extends Exception {
	/** Obs.:
	 * ... extends Exception 		->	the compiler forces the treatment
	 * ... extends RuntimeException ->	the compiler do not forces the treatment
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	

}
