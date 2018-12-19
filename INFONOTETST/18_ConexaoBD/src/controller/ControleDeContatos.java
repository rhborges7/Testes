package controller;

import model.*;

import model.DAO.ContatoDAO;
import util.Teclado;

public class ControleDeContatos {
	
	private static final int CADASTRAR_MENSAGEM = 1;
	private static final int VISUALIZAR_MENSAGENS = 2;
	private static final int APAGAR_MENSAGEM = 3;
	private static final int ATUALIZAR_MENSAGEM = 4;
	private static final int SAIR= 5;
	
public static void main(String[] args) {
		
		ControleDeContatos cdc = new ControleDeContatos();
		int opcao = SAIR;
		
		do {
			cdc.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua Opção : ");
			
		switch (opcao) {
		case CADASTRAR_MENSAGEM:
			cdc.cadastrarMensagem();
			break;
		
		case VISUALIZAR_MENSAGENS:
			cdc.buscarMensagens();
			break;
			
		case APAGAR_MENSAGEM:
			cdc.apagarMensagem();
			break;
		
		case ATUALIZAR_MENSAGEM:
			cdc.atualizarMensagem();
			break;
		
		default:
		System.out.println("OPÇAO INVÁLIDA!");
		}
		Teclado.lerTexto("Pressione uma tecla para continuar...");
		
		
			
		}while (opcao !=SAIR);

	}

	
	public void mostrarMenu() {
		System.out.println("================================================");
		System.out.println("				Cadastro de Mensagens				");
		System.out.println("================================================");
		System.out.println("1 - Cadastrar Mensagem");
		System.out.println("2 - Mostrar Mensagem");
		System.out.println("3 - Apagar Mensagem");
		System.out.println("4 - Atualizar Mensagem");
		System.out.println("5 - Sair");
		
	}
	
	public void cadastrarMensagem() {
		System.out.println("===========================================================");
		System.out.println("		Cadastro de Mensagens");
		System.out.println("===========================================================");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String mensagem = Teclado.lerTexto("Mensagem: ");
		
		Contato contato = ContatoDAO.inserir(nome, email, mensagem);
		
		System.out.println(contato);
		
	}
	
	public void buscarMensagens() {
		Contato[] contatos = ContatoDAO.buscarTodos();
		
		for(int i=0; i<contatos.length; i++) {
			System.out.println(
					contatos[i].getId() + "--------" + 
					contatos[i].getNome() + "--------" +
					contatos[i].getEmail() + "--------" + 
					contatos[i].getMensagem());
		}
	}
	
	public void apagarMensagem() {
		System.out.println("================================================");
		System.out.println("		 Apagar de Mensagens				");
		System.out.println("================================================");
		int id = Teclado.lerInt("Digite o número da mensagem a ser apagada :");
		
		ContatoDAO.excluir(id);
		
		System.out.println("Mensagem apagada com sucesso");
		
	}
	
	public void atualizarMensagem() {
		System.out.println("================================================");
		System.out.println("	   Atualizar de Mensagens				");
		System.out.println("================================================");
		int id = Teclado.lerInt("Digite o número id da mensagem a ser editada :");
		String mensagem = Teclado.lerTexto("Mensagem: ");
		
		ContatoDAO.atualizar(mensagem, id);
		
		System.out.println("Mensagem atualizada com sucesso");
		
	}
	
	
	
	
	
}
