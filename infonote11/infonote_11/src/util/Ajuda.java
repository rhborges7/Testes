package util;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ajuda {
	
	private String texto;
	
	public Ajuda(String nomeArquivo) throws Exception{
		
		// ABRE O ARQUIVO
		BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));
		
		// VARIAVEL PARA ARMAZENAR AS LINHAS DE TEXTO DO ARQUIVO
		 String linha = "";
		 
		 do {
			 // FAZ A LEITURA DA LINHA DO ARQUIVO
			 linha = in.readLine();
			 
			 // CASO NAO TENHA TERMINADO AS LINHAS VAI ARMAZENANDO
			 if (linha != null) {
				 texto += linha + "\n";
			 }
			
		 }while (linha != null);
		
	}

	public String getTexto() {
		return texto;
	}
}
