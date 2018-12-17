package model;

import java.util.Arrays;

public abstract class Usuario {
	String login;
	String senha;
	int tipo;
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	/**
	 * 
	 */
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
		}
	public Usuario(String login,String senha,int tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = " Usuario : " + login + ENTER + "\n Senha : " + senha + ENTER +  "\n Tipo : " + tipo + ENTER;
		return retValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
