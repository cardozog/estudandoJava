import java.util.Scanner;
public class Main {



	public static int Exercicio1() 
	{
		int num1,num2,soma=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro e o segundo número separados por espaços para fazer uma soma: ");
		num1 = sc.nextInt();
		num2= sc.nextInt();
		sc.close();
		soma = num1+num2;

		return soma;
	}

	public static void Exercicio2() 
	{
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.*/
		double raio,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Insira o raio de um círculo: ");
		raio=sc.nextDouble();		
		sc.close();

		area = Math.PI*Math.pow(raio, 2);

		System.out.printf("Área: %.4f %n",area);

	}

	public static void Exercicio3() 
	{

	}


	public static void main(String[] args) 
	{
		int opcao;
		Scanner sc2 = new Scanner(System.in);

		do {
			System.out.println("MENU DE EXERCÍCIOS: ");
			System.out.println("1 - Soma");
			System.out.println("2 - Raio");
			System.out.println("3 - Diferença de produtos");
			System.out.println("4 - Calcular Salário / horas trabalhadas");
			System.out.println("5 - Calcular valor pelas quantidades");
			System.out.println("6 - Calculos matematicos com 3 valores");
			System.out.println("7 - Sair");
			System.out.print("Insira sua opção: ");
			opcao = sc2.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Soma: "+ Exercicio1());
				break;
			case 2:
				Exercicio2();
				break;

			}

		}while(opcao!=7);

		sc2.close();
		
		
		//restante fiquei com preguiça mas é isso ai


	}

}
