package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Notebook {

	private String serialNote;
	private String modelo;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;

	/**
	 * @return the serialNote
	 */
	public String getNumeroNote() {
		return serialNote;
	}

	/**
	 * @param serialNote the serialNote to set
	 */
	public void setNumeroNote(String serialNote) {
		this.serialNote = serialNote;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the estoque
	 */
	public int getEstoque() {
		return estoque;
	}

	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	/**
	 * @return the precoUnitario
	 */
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	/**
	 * @param precoUnitario the precoUnitario to set
	 */
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	/**
	 * @return the figura
	 */
	public String getFigura() {
		return figura;
	}

	/**
	 * @param figura the figura to set
	 */
	public void setFigura(String figura) {
		this.figura = figura;
	}

	/**
	 * @return the dataCadastro
	 */
	public String getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	// METODO TOSTRING PARAR DAR SAIDA NOS VALORES INDICADOS
	/*public String toString() {
		return "Notebook :" + serialNote + "\n modelo :" + modelo + "\n descricao :" + descricao + "\n estoque :"
				+ estoque + "\n precoUnitario" + precoUnitario + "\n figura :" + figura + "\n dataCadastro :"
				+ dataCadastro;
	}*/
	
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		Locale local = new Locale("pt", "BR");
		
		retValue = "Informações sobre o Notebook:" + ENTER +  "\n Número de Série do Notebook :" + serialNote + ENTER +  "\n modelo :" + modelo + ENTER +  "\n descricao :" + descricao + ENTER + "\n estoque :"
				+ estoque + ENTER +  "\n precoUnitario" +
				NumberFormat.getCurrencyInstance(local).format(this.precoUnitario) + ENTER + "\n figura :" + figura + ENTER + "\n dataCadastro :"
				+ dataCadastro + ENTER;
		
		return retValue;
	}

	/**
	 * @param serialNote
	 * @param modelo
	 * @param descricao
	 * @param estoque
	 * @param precoUnitario
	 * @param figura
	 * @param dataCadastro
	 */
	/**
	 * 
	 */
	public Notebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Notebook(String serialNote, String modelo, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		super();
		this.serialNote = serialNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}
	
	public void mostrar() {
		System.out.println("Numero do Notebook : " + serialNote);
		System.out.println("modelo : " + modelo);
		System.out.println("Descrição : " + descricao);
		System.out.println("Estoque : " + estoque);
		System.out.println("Preço Unitario : " + precoUnitario);
		System.out.println("Figura : " + figura);
		System.out.println("Data de Cadastro : " + dataCadastro);
	}

}
	
