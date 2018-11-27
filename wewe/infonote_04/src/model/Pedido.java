package model;

public class Pedido {

	private int numero;
	private String dataEmissao;
	private String formaDePagamento;
	private Double valorTotal;
	private String situacao;

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the dataEmissao
	 */
	public String getDataEmissao() {
		return dataEmissao;
	}

	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	/**
	 * @return the formaDePagamento
	 */
	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	/**
	 * @param formaDePagamento the formaDePagamento to set
	 */
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	/**
	 * @return the valorTotal
	 */
	public Double getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	// METODO MOSTRAR PARAR DAR SAIDA NOS VALORES INDICADOS
	public void mostrar() {
		System.out.println("Data de Emissão : " + dataEmissao);
		System.out.println("Numero : " + numero);
		System.out.println("Forma de Pagamento : " + formaDePagamento);
		System.out.println("Valor Total : " + valorTotal);
		System.out.println("Situação : " + situacao);

	}

	/**
	 * @param numero
	 * @param dataEmissao
	 * @param formaDePagamento
	 * @param valorTotal
	 * @param situacao
	 */
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Pedido(int numero, String dataEmissao, String formaDePagamento, Double valorTotal, String situacao) {
		super();
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
	}

	
	
	
}