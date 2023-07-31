package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static Scanner sc = new Scanner(System.in);
	public static char menu()
	{
		char opcao;

		System.out.println("BANCO");
		System.out.println("Selecione uma opção ");
		System.out.println("S - Saque ");
		System.out.println("D - Depósito");
		opcao = sc.next().charAt(0);
		System.out.println(Character.toUpperCase(opcao));
		return Character.toUpperCase(opcao);

	}



	public static void main(String[] args) {
		char opcao;
		int numeroConta;
		String nomeTitular;	
		double saldo,valor;
		ContaBancaria conta;
		Scanner sc = new Scanner(System.in);

		System.out.println("BANCO - CRIAÇÃO DE CONTA");
		System.out.print("Insira o número da conta: ");
		numeroConta = sc.nextInt();

		System.out.print("Digite o nome completo do titular: ");
		sc.nextLine();
		nomeTitular=sc.nextLine();
		System.out.print("Deseja fazer o primeiro depósito?(s/n): ");
		opcao = sc.next().charAt(0);
		opcao = Character.toUpperCase(opcao);

		if (opcao == 'S') {
			System.out.println("Insira o valor a ser depositado inicialmente");
			saldo = sc.nextDouble();

			conta = new ContaBancaria(numeroConta,nomeTitular,saldo);

		}else {

			conta = new ContaBancaria(numeroConta,nomeTitular);

		}

		do {
			System.out.println(conta);
			opcao = menu();
			switch(opcao) {

			case 'S':
				System.out.print("Insira o valor a ser sacado: ");
				valor = sc.nextDouble();
				if(conta.saque(valor)== true) {
					System.out.println("Saque realizado com sucesso!");
				}else{
					System.out.println("ERRO! Saque não realizado.");
				};
				break;

			case 'D':
				System.out.println("Insira o valor a ser depositado");
				valor = sc.nextDouble();
				if (conta.deposito(valor)==true) {
					System.out.println("Depósito realizado com sucesso!");
				}else {
					System.out.println("ERRO! Depósito não realizado.");
				}
				break;
			}
		}while (opcao != 'X');

		sc.close();

	}
}
