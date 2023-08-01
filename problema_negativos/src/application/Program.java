package application;

import java.util.Scanner;

public class Program {

	/*
	 Faça um programa que leia um número inteiro positivo N (máximo = 10) 
	 e depois N números inteiros 
	 e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a quantidade de números a ser inserida: ");
		int n=sc.nextInt();
		//declaração do vetor
		int[] vetorNumeros = new int[n];

		for (int i=0;i<vetorNumeros.length;i++) {

			System.out.print("Insira o número: ");
			vetorNumeros[i]=sc.nextInt();
		}
		System.out.println("Números negativos: ");
		for(int i=0; i<vetorNumeros.length;i++) {
			if (vetorNumeros[i]<0) {
				System.out.println(vetorNumeros[i]);
			}
		}
		sc.close();
	}

}
