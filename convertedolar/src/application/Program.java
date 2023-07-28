package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

//programa deve ler cotação do dólar, o valor de dólares que serão comprados 
//a pessoa deve pagar 6% de imposto em cima do valor em dólares

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double cotacao,valorEmDolares, valorEmReais;
		
		System.out.print("Qual a cotação do dólar atualmente?: ");
		cotacao=sc.nextDouble();
		System.out.print("Qual o valor em dólares a ser comprado?: ");
		valorEmDolares=sc.nextDouble();
		
		valorEmReais=CurrencyConverter.conversorParaReais(valorEmDolares, cotacao);
		
		System.out.printf("Valor a ser pago em reais: R$%.2f %n ",valorEmReais);
		
		sc.close();
	}

}
