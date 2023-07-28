package util;

public class Calculator {
	public static final double PI = Math.PI;
	
	public static double circunferencia(double raio) {
		
		return 2*PI*raio;
	}
	
	
public static double volumeEsfera(double raio) {
		
		return (4*PI*Math.pow(raio, 3))/3;
	}
}
