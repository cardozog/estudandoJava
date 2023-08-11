package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Comentario;
import entities.Post;
import entities.Timeline;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//lista de posts pra representar uma linha do tempo
		Timeline timeline = new Timeline();
		Post post;
		Comentario comentario;

		System.out.println("REDE SOCIAL??");
		System.out.println("Faça o post agora:");
		
		
		sc.close();
	}

}
