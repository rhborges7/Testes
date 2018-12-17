package model;

import java.util.Arrays;

public class Endereco {

	

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	// METODO MOSTRAR PARAR DAR SAIDA NOS VALORES INDICADOS
	/*public void mostrar() {
		System.out.println("Logradouro : " + logradouro);
		System.out.println("Numero : " + numero);
		System.out.println("Complemento : " + complemento);
		System.out.println("Bairro : " + bairro);
		System.out.println("Cidade : " + cidade);
		System.out.println("Estado : " + estado);
		System.out.println("CEP : " + cep);
	} */
	
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "Logradouro : " + logradouro + ENTER +  "\n Numero : " + numero + ENTER +  "\n Complemento : " + complemento + ENTER + "\n Bairro : "
				+ bairro + ENTER +  "\n Cidade : " + cidade + ENTER +  "\n Estado : " + estado + ENTER
				+ "\n CEP :" + cep + ENTER;
		
		return retValue;
	}

	/**
	 * @param logradouro
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cidade
	 * @param estado
	 * @param cep
	 */
	
	
	public Endereco() {
		super();
	}
	
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	/**
	 * 
	 */
	

	

}
