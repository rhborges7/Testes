package util;

import java.io.FileInputStream;
import java.util.Properties;

public class Configurador {

	private String idioma;
	private String regiao;
	private String arquivoAjuda;

	public String getIdioma() {
		return idioma;
	}

	public String getRegiao() {
		return regiao;
	}

	public String getArquivoAjuda() {
		return arquivoAjuda;
	}

	public Configurador() throws Exception {

		// ABRE O ARQUIVO DE PROPRIEDADES
		FileInputStream arq = new FileInputStream("config.ini");
		// CRIA UM OBJETO PARA ARMAZENAR AS PROPRIEDADES
		Properties prop = new Properties();
		// CARREGA O CONTEUDO DO ARQUIVO DE PROPRIEDADES
		prop.load(arq);

		// FECHA O ARQUIVO DE PROPRIEDADES
		arq.close();

		// CARREGA AS RESPECTIVAS PROPRIEDADES E CADA ATRIBUTO
		idioma = prop.getProperty("idioma");
		regiao = prop.getProperty("regiao");
		arquivoAjuda = prop.getProperty("ajuda");

	}
	
	

}
