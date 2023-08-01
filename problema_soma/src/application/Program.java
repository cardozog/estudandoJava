package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
	- Imprimir todos os elementos do vetor 
	- Mostrar na tela a soma e a média dos elementos do vetor 
	 */

	public static double somaConteudoVetor(double vetor[]) {
		double soma=0.0;
		for (int i=0;i<vetor.length;i++) {
			soma+=vetor[i];
		}

		return soma;
	}


	public static void preencheVetor(double vetor[] ) {



	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira quantos números vc vai digitar: ");
		int n=sc.nextInt();
		double[] vetor = new double[n];

		for (int i=0;i<vetor.length;i++) {
			System.out.print("Digite um valor: ");
			vetor[i]=sc.nextDouble();
		}

		System.out.print("VALORES = ");
		for(int i=0;i<vetor.length;i++) {
			System.out.printf(" %.1f ",vetor[i]);
		}

		System.out.printf("%nSOMA = %.1f",somaConteudoVetor(vetor));
		System.out.printf("%nMÉDIA = %.1f",somaConteudoVetor(vetor)/vetor.length);

		sc.close();
	}

}
