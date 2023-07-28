package entities;

public class Triangulo {
	public double a,b,c,area;

	//não recebe parametro porque só usamos parametros que estão aqui dentro da classe
	public double calculaArea() {
		double p;

		p= (a+b+c)/2;

		return Math.sqrt(p * (p-a)*(p-b)*(p-c));
	}
}
