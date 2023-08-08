package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	//programa que solicite informações sobre N contratos de um determinado funcionário.


	public static int menu(Scanner sc) {
		int opcao;
		System.out.println("-----------------------");
		System.out.println("MENU DE OPERAÇÕES");
		System.out.println("-----------------------");
		System.out.println("1. Cadastrar Funcionário ");
		System.out.println("2. Cadastrar Contratos");
		System.out.println("3. Remover Contratos ");
		System.out.println("4. Calcular salário total");
		System.out.println("-----------------------");
		System.out.print("Insira aqui sua opção: ");
		opcao= sc.nextInt();

		return opcao;
	}


	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

	}

}
