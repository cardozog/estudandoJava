import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double A,x;

		Scanner sc = new Scanner(System.in);
		x=sc.nextDouble();
		sc.close();
		//raiz quadrada
		A = Math.sqrt(x);
		System.out.println(A);
		
		//potencia
		A = Math.pow(x, 2);
		System.out.println(A);
	
		//valor absoluto
		A=Math.abs(x);
		System.out.println(A);
		
	}
}
