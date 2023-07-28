package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	//utilizei o projeto estoque como exemplo, conforme o curso

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;
		double price;
		int quantity;


		System.out.print("Insira o nome, valor e quantidade do produto: ");
		nome=sc.next();
		price=sc.nextDouble();
		quantity=sc.nextInt();

		Product produto = new Product(nome, price, quantity);
		sc.close();

		System.out.println(produto);

		produto.addProducts(5);

		//por estar num println, ele ja entende que vai virar uma string então coloca o .toString() implicitamente
		System.out.println(produto);

		produto.removeProducts(6);

		System.out.println(produto);

	}

}
