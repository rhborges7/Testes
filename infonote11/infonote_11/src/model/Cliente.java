package model;

import java.util.Arrays;

public class Cliente extends Usuario implements IUsuario {

	private String codigoCliente;
	private String nome;
	private String email;
	private String telefone;
	private Endereco enderecos[] = new Endereco[10];
	private Pedido pedidos[] = new Pedido[10];
	

	/**
	 * @return the codigoCliente
	 */
	public String getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
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
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the enderecos
	 */
	/**
	 * @return the enderecos
	 */
	public Endereco[] getEnderecos() {
		return enderecos;
	}

	/**
	 * @param enderecos the enderecos to set
	 */
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}

	/**
	 * @return the pedidos
	 */
	public Pedido[] getPedidos() {
		return pedidos;
	}

	/**
	 * @param pedidos the pedidos to set
	 */
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param login
	 * @param senha
	 * @param tipo
	 */
	public Cliente(String login, String senha, int tipo, String codigoCliente, String nome, String email,
			String telefone, Endereco endereco) {
		super(login, senha, tipo);
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		// INSERE NA POSIÇÃO ZERO DO VETOR O ENDEREÇO RESIDENCIAL
		inserirEndereco(endereco);
		// TODO Auto-generated constructor stub
	}

	// SOBRECARGA DO METODO PARA USAR OS PARAMETROS NO CADASTRO DE USUARIO
	public Cliente(String login, String senha, int tipo, String nome, String email, String telefone,
			Endereco endereco) {
		super(login, senha, tipo);
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		// INSERE NA POSIÇÃO ZERO DO VETOR O ENDEREÇO RESIDENCIAL
		inserirEndereco(endereco);
		// TODO Auto-generated constructor stub
	}

	// INSERIR O PEDIDO NO VETOR
	public boolean inserirPedido(Pedido pedido) {
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] == null) {
				pedidos[i] = pedido;
				return true;
			}
		}
		return false;
	}

	// INSERIR O ENDEREÇO NO VETOR

	public boolean inserirEndereco(Endereco end) {
		for (int i = 0; i < enderecos.length; i++) {
			if (enderecos[i] == null) {
				enderecos[i] = end;
				return true;
			}
		}
		return false;
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

		retValue = "Informações sobre o Cliente : " + super.toString() + ENTER + "Codigo do Cliente : " + codigoCliente
				+ ENTER + "\n Nome : " + nome + ENTER + "\n Email : " + email + ENTER + "\n Telefone : " + telefone
				+ ENTER + "\n Enderecos : " + Arrays.toString(enderecos) + ENTER + "\n Pedidos : "
				+ Arrays.toString(pedidos) + ENTER + "\n Login :" + login + ENTER + "\n Senha : " + senha + ENTER
				+ "\n Tipo : " + tipo + ENTER;

		return retValue;
	}

	//METODO PARAR VALIDAR O LOGIN 
	public boolean validarLogin(String login, String senha) {
		if (getLogin().equals(login) && getSenha().equals(senha)) {
			return true;
		} else {
			return false;

		}
	}
	
	public String getNomeInvertido() {
		String nome, sobrenome;
		int posicao = getNome().indexOf("");
		nome = getNome().substring(0,posicao);
		
		posicao = getNome().lastIndexOf("");
		sobrenome = getNome().substring(posicao + 1);
		
		return sobrenome + "," + nome;
	}

}
