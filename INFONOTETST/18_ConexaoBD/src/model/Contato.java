package model;

public class Contato {
	private int id;
	private String nome;
	private String mensagem;
	private String email;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param id
	 * @param nome
	 * @param mensagem
	 * @param email
	 */
	public Contato(int id, String nome, String mensagem, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.mensagem = mensagem;
		this.email = email;
	}

	public Contato(String nome, String mensagem, String email) {
		super();
		this.nome = nome;
		this.mensagem = mensagem;
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "Mensagem Enviada com Sucesso:" + ENTER + 
				"Nome:" + nome + ENTER + 
				"E-mail:" + email + ENTER + 
				"Mensagem: " + mensagem;
		return retValue;
	}

}
