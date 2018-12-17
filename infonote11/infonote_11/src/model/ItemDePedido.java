package model;

import java.text.NumberFormat;
import java.util.Locale;

public class ItemDePedido {

	private int qtde;
	private double subtotal;
	private Notebook notebook;

	/**
	 * @return the qtde
	 */
	public int getQtde() {
		return qtde;
	}

	/**
	 * @param qtde the qtde to set
	 */
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Notebook getNotebook() {
		return notebook;
	}

	// METODO MOSTRAR PARAR DAR SAIDA NOS VALORES INDICADOS
	/*public void mostrar() {
		System.out.println("Logradouro : " + qtde);
		System.out.println("Numero : " + subtotal);

	}*/
	
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		Locale local = new Locale("pt","BR");
		
		retValue = "Quantidade : " + qtde + ENTER +  "\n Subtotal : "  + NumberFormat.getCurrencyInstance(local).format(this.subtotal) + ENTER;
		
		return retValue;
	}

	/**
	 * @param qtde
	 * @param subtotal
	 */
	public ItemDePedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		
	}

	public ItemDePedido(int qtde,Notebook notebook, double subtotal) {
		
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}

	
}
