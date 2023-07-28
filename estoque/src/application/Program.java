package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Product produto;
		produto = new Product();
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o nome, valor e quantidade do produto: ");
		produto.nome=sc.next();
		produto.price=sc.nextDouble();
		produto.quantity=sc.nextInt();

		sc.close();

		System.out.println(produto);
		
		produto.addProducts(5);
		
		//por estar num println, ele ja entende que vai virar uma string então coloca o .toString() implicitamente
		System.out.println(produto);
		
		produto.removeProducts(6);
		
		System.out.println(produto);
		
	}

}
