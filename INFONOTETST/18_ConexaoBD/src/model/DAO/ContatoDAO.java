package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Contato;
import util.Conexao;

public class ContatoDAO {

	public static Contato inserir(String nome, String email, String mensagem) {

		Contato contato = null;
		try {
			// CRIAÇÃO DO INSERT
			String sql = "insert into contato (nome,email,mensagem) values (?,?,?)";

			// OBTER A CONEXÃO COM O BANCO DE DADOS
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "rhuan",
					"1234");
			// ABRIR A CONEXÃO
			Connection con = conex.obterConexao();

			// PREPARAR O COMANDO PARA SER EXECUTADO
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);

			// COMANDO EXECUTADO
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		contato = new Contato(nome, email, mensagem);
		return contato;
	}

	public static Contato excluir(int id) {

		Contato contato = null;
		try {
			// CRIAÇÃO DO DELETE
			String sql = "delete from contato where id = ? ";

			// OBTER A CONEXÃO COM O BANCO DE DADOS
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "rhuan",
					"1234");
			// ABRIR A CONEXÃO
			Connection con = conex.obterConexao();

			// PREPARAR O COMANDO PARA SER EXECUTADO
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setInt(1, id);
			comando.executeUpdate();

			// COMANDO EXECUTADO
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return contato;
	}
	
	public static Contato atualizar(String mensagem, int id) {

		Contato contato = null;
		try {
			// CRIAÇÃO DO UPDATE 
			String sql = "update contato set mensagem = ? where id = ?";

			// OBTER A CONEXÃO COM O BANCO DE DADOS
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "rhuan",
					"1234");
			// ABRIR A CONEXÃO
			Connection con = conex.obterConexao();

			// PREPARAR O COMANDO PARA SER EXECUTADO
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, mensagem);
			comando.setInt(2, id);
			

			// COMANDO EXECUTADO
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		return contato;
	}

	public static Contato[] buscarTodos() {
		Contato[] contatos = null;

		try {
			// CRIAÇÃO DO SELECT
			String sql = "Select * from contato";

			// OBTER A CONEXAO COM O BANCO DE DADOS
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "rhuan",
					"1234");

			Connection con = conex.obterConexao();

			/*
			 * EXECUTA A CONFIRMAÇÃO DIRETA DE ACESSO AO BANCO POIS NAO SAO NECESSARIAS
			 * INFORMAÇÕES PARA A QUERY (CARACTER CURINGA)
			 */
			Statement comando = con.createStatement();

			/*
			 * ResutSet - CLASSE JAVA QUE MONTA EM MEMORIA UMA MATRIZ COM A RESPOSTA DAS
			 * LINHAS DO BANCO DE DADOS
			 */
			ResultSet rs = comando.executeQuery(sql);

			// VETOR DE OBJETOS
			contatos = new Contato[10];

			/*
			 * PASSAGEM DE LINHA DE DADOS DO ResultSet PARA O VETOR DE OBJETOS (UMA LINHA DE
			 * DADOS DA MATRIZ DO ResultSet É COPIADA PARA UM OBJETO NO VETOR CONTATOS)
			 * 
			 */
			int i = 0;
			while (rs.next()) {
				contatos[i++] = new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("email"),
						rs.getString("mensagem"));

			}

			// É NECESSARIO ENCERRAR O ACESSO AO BANCO PARA LIBERAR A CONEXAO
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return contatos;

	}

}
