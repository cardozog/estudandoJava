package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();	

		//isso é um vetor de referências, cada posição é uma referência e precisamos instanciar cada produto
		Product[] produtos = new Product[n];

		for (int i=0;i<produtos.length;i++) {
			sc.nextInt();
			String nome =sc.nextLine();
			double preco = sc.nextDouble();

			produtos[i]=new Product(nome,preco);


		}
		double soma=0.0; 

		for (int i=0;i<produtos.length;i++) {
			soma+=produtos[i].getPrice();
		}
		double media= soma/n;
		sc.close();
		System.out.println(media);
	}
}
