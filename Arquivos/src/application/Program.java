package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Bom dia", "Boa tarde", "Um salve" };

		String caminho = "C:\\Users\\Gui\\Desktop\\estudandoJava\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
			for(String linha: linhas) {
				bw.write(linha);
				bw.newLine();
				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
