package main;
public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mensagem;

	public ParametrosInvalidosException(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String getMessage() {
		return String.format(mensagem);
	}
	
}
