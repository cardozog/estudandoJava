package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	//1) fazer um programa que leia a largura e comprimento de um retângulo 
	//determine os valores de área, perímetro e diagonal.

	public static void main(String[] args) {
		double diagonal, perimetro, area;
		Rectangle retangulo;
		retangulo = new Rectangle();
		Scanner sc = new Scanner(System.in);

		System.out.print("Largura: ");
		retangulo.largura=sc.nextDouble();

		System.out.print("Comprimento: ");
		retangulo.comprimento=sc.nextDouble();
		
		
		area= retangulo.area();
		perimetro=retangulo.perimetro();
		diagonal = retangulo.diagonal();
		
		
		System.out.printf("Área: %.2f %n",area);
		System.out.printf("Perímetro: %.2f %n",perimetro);
		System.out.printf("Diagonal: %.2f %n",diagonal);
		sc.close();
	}

}
