package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	/*
 Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. OK
 Depois, mostrar na tela a altura média das pessoas
 e mostrar também a porcentagem de pessoas com menos de 16 anos
 	bem como os nomes dessas pessoas caso houver. 

	 */

	public static double alturaMedia(Pessoa vetor[]) {
		double media=0.0;

		for(int i=0; i<vetor.length;i++) {
			media+=vetor[i].getAltura();
		}
		media /=vetor.length;
		return media;
	}

	public static double percMenores16Anos(Pessoa vetor[]) {
		double menores=0;
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i].getIdade()<16) {
				menores++;
			}
		}

		return (menores*100.0)/vetor.length;
	}

	public static void pessoasMenores16Anos(Pessoa vetor[]) {
		System.out.println("Pessoas menores de 16 anos");
		for(int i=0;i<vetor.length;i++) {
			if (vetor[i].getIdade()<16) {
				System.out.println(vetor[i].getNome());
			}
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		String nome;
		int idade;
		double altura;

		System.out.print("Quantas pessoas serão lidas aqui?: ");
		int n=sc.nextInt();

		Pessoa[] pessoas=new Pessoa[n];

		for(int i=0;i<pessoas.length;i++) {
			System.out.printf("Dados da %dª pessoa:%n",i+1);
			System.out.print("Insira o nome: ");
			sc.nextLine();
			nome =sc.nextLine();

			System.out.print("Insira a idade");
			idade =sc.nextInt();

			System.out.print("Insira a altura (ex 1.75): ");
			altura =sc.nextDouble();

			//para cada posição desse vetor de pessoas, estamos instanciando o objeto (criando os atributos na memória). 
			pessoas[i]=new Pessoa(nome,idade,altura);
		}

		System.out.printf("%n%nAltura média das pessoas: %.2fm %n", alturaMedia(pessoas));
		System.out.printf("Média de pessoas com 16 anos %.1f%% %n", percMenores16Anos(pessoas));
		pessoasMenores16Anos(pessoas);

		sc.close();
	}

}
