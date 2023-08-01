package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Quarto;

public class Program {

	public static void listarQuartos(Quarto vetor[]) {
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]!=null) {
				System.out.println("--------------------------------------------------");
				System.out.printf("QUARTO %d OCUPADO %n",i);
				System.out.printf("NOME: %s %n",vetor[i].getNome());
				System.out.printf("EMAIL: %s %n",vetor[i].getEmail());
			}
			else {
				System.out.println("--------------------------------------------------");
				System.out.printf("Quarto %d vazio%n",i);
			}
		}}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		String nome, email;
		int n;
		Quarto[] quartos = new Quarto[10];

		System.out.print("Determine quantos alunos vão alugar: ");
		n = sc.nextInt();
		Aluno[] alunos = new Aluno[n];


		for(int i=0;i<alunos.length;i++) {
			sc.nextLine();
			System.out.print("Digite o nome do aluno: ");
			nome = sc.nextLine();
			System.out.print("Digite o e-mail do aluno: ");
			email = sc.nextLine();

			//lembrando que isso aqui chama o construtor pra criar o objeto
			alunos[i]= new Aluno(nome,email);
			listarQuartos(quartos);
			System.out.print("Selecione o quarto de 0 a 9: ");
			n = sc.nextInt();
			quartos[n] = new Quarto(nome,email);
		}

		System.out.printf("%n%n%n%n%nLISTAGEM FINAL DE QUARTOS:%n");
		listarQuartos(quartos);

		sc.close();
	}

}


