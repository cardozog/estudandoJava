package application;
import java.util.Scanner;
import entities.Triangulo;


public class Program {

	public static void main(String[] args) {
		Triangulo x, y;

		//instanciar é tipo o malloc no C, a gente aloca um espaço na memória pras variáveis que tem lá dentro da classe Triangulo
		//A gente cria um objeto com os atributos da classe, e eles tem q ter o mesmo nome
		x= new Triangulo();
		y=new Triangulo();
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o lado A, B e C do triângulo X: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();


		System.out.print("Insira o lado A, B e C do triângulo Y: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		sc.close();
		
		x.area=x.calculaArea();
		y.area=y.calculaArea();

		System.out.printf("A área do triângulo x é: %.2f %n",x.area);
		System.out.printf("A área do triângulo y é: %.2f %n",y.area);

		if (x.area > y.area) 
		{
			System.out.println("A área de X é maior");
		} else 
		{
			System.out.println("A área de Y é maior");
		}


	}

}
