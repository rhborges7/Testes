package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String url; // LOCAL DO BANCO DE DADOS
	private String driver; // CLASSE JAVA DO FRAMEWORK QUE FOI BAIXADO NA WEB
	private String login; // LOGIN DO USUARIO NO SGBD
	private String senha; // SENHA DO USUAIO NO SGBD

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param url
	 * @param driver
	 * @param login
	 * @param senha
	 */
	public Conexao(String url, String driver, String login, String senha) {
		try {

			this.url = url;
			this.driver = driver;
			this.login = login;
			this.senha = senha;
			Class.forName(driver); //METODO QUE INFORMA O JDBC  QUAL É O DRIVER
			// REGISTRO DA CLASSE DE DRIVER NA CONEXAO ATRAVES DE JDBC
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Connection obterConexao() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, login, senha);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	} 
	
	

}
