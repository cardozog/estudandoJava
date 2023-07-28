import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int y=32;
		double x=10.35784;
		char c;
		//string por algum motivo é com S maiusculo
		String i;

		System.out.println("Hello World");
		//igualzinho no C pra mostrar duas casas decimais, mas a quebra de linha é diferente. ao invés de \n é %n
		System.out.printf("%.2f%n",x);
		System.out.println(y);
		//configurando localização do programa
		Locale.setDefault(Locale.US);


		//casting - conversão explicita
		y=(int)x;

		//entrada de dados - precisamos criar um objeto scanner pra receber
		Scanner sc = new Scanner(System.in);
		//precisamos usar sc.close() quando não formos ler mais nada
		System.out.print("veja ai se da pra digitar: ");
		
		//para int sc.nextInt(); e double sc.nextDouble(); E no double ele pega o local do sistema.
		i = sc.next();		

		System.out.println(i);
		
		//para ler uma string com espaços até o usuario pressionar enter usamos da seguinte maneira:
		System.out.println("digite um texto aqui: ");
		i=sc.nextLine();		
		System.out.println(i);

		//para char já fica um pouco diferente, é sc.next().charAt(0); pra pegar o primeiro caractere digitado
		c = sc.next().charAt(0);
		
		System.out.println(c);
		
		
		//quando trabalhamos com leitura de numeros e strings, precisamos limpar o buffer de leitura, para isso usamos
		sc.next();
		
		sc.close();
	}

}
