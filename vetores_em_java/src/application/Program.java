package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();

		//declaração de um vetor
		double[] vetor=new double [n];
		//-----------------------------------
		for (int i=0; i<n; i++) {
			vetor[i]=sc.nextDouble();
			System.out.println(vetor[i]);
		}



		sc.close();
	}

}
