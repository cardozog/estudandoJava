package application;

import java.util.Scanner;

import services.PrintServices;

public class Program {

	public static void main(String[] args) {
		// permitem que classes, interfaces e métodos possam ser parametrizados por tipo

		Scanner sc = new Scanner(System.in);

		PrintServices<Integer> ps = new PrintServices<>();

		System.out.print("Quantos números serão incluídos na lista? ");
		int total = sc.nextInt();
		for(int i=0;i<total;i++) {
			System.out.print("Insira o número: ");
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.first();
		ps.print();
		sc.close();
	}

}
