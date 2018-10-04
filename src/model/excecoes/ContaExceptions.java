package model.excecoes;

public class ContaExceptions extends RuntimeException{

	/**
	 * Exececoes que tratam da conta
	 */
	private static final long serialVersionUID = 1L;
	
	public ContaExceptions (String msg) {
		super(msg);
	}

}
