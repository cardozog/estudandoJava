package util;

public class CurrencyConverter {
 public static final double iof=1.06;

 public static double conversorParaReais(double valorEmDolares, double cotacao) {
	 return valorEmDolares*iof*cotacao;
 }
}
