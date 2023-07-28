package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	//utilizar membros estáticos é usar diretamente os métodos e valores de uma classe quando não precisamos criar um objeto
	//por exemplo com formulas e valores constantes
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio,circ,vol;

		System.out.print("Entre com o raio: ");
		raio = sc.nextDouble();

		circ = Calculator.circunferencia(raio);
		vol= Calculator.volumeEsfera(raio);

		System.out.printf("Circunferência: %.2f %n",circ);
		System.out.printf("Volume: %.2f %n",vol);
		System.out.printf("Valor de PI: %.2f %n",Calculator.PI);		
		sc.close();
	}

}
