package model;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Pedido {

	private int numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private Double valorTotal;
	private String situacao;
	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

	/**
	 * @return the numeroPedido
	 */
	public int getNumero() {
		return numeroPedido;
	}

	/**
	 * @param numeroPedido the numeroPedido to set
	 */
	public void setNumero(int numeroPedido) {
		this.numeroPedido = numeroPedido;
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
	/*
	 * public void mostrar() { System.out.println("Data de Emissão : " +
	 * dataEmissao); System.out.println("Numero : " + numeroPedido);
	 * System.out.println("Forma de Pagamento : " + formaDePagamento);
	 * System.out.println("Valor Total : " + valorTotal);
	 * System.out.println("Situação : " + situacao);
	 * System.out.println("\n\nItens do Pedido: \n"); for (int i=0; i <itens.length;
	 * i++) { if(itens[i] !=null) { itens[i].mostrar(); } }
	 * 
	 * }
	 */

	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		Locale local = new Locale("pt", "BR");

		retValue = " Pedido : " + numeroPedido + ENTER + "\n Data de Emissao : " + dataEmissao + ENTER
				+ "\n Forma De Pagamento : " + formaDePagamento + ENTER + "\n Valor Total : "
				+ NumberFormat.getCurrencyInstance(local).format(this.valorTotal) + ENTER + "\n Situacao : " + situacao
				+ ENTER + "\n Endereco de Entrega=" + enderecoEntrega + ENTER + "\n Itens : " + Arrays.toString(itens)
				+ ENTER;
		for (int i = 0; i < itens.length; i++) {
			retValue += itens[i] + ENTER;
		}
		return retValue;
	}

	/**
	 * @param numeroPedido
	 * @param dataEmissao
	 * @param formaDePagamento
	 * @param valorTotal
	 * @param situacao
	 */
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int numeroPedido, String dataEmissao, String formaDePagamento, Double valorTotal, String situacao,
			Endereco enderecoEntrega) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
	}

	/**
	 * @return the enderecoEntrega
	 */
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	/**
	 * @return the itens
	 */
	public ItemDePedido[] getItens() {
		return itens;
	}

	public Endereco setEnderecoEntrega() {
		return enderecoEntrega;
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}

}