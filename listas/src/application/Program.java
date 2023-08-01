package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		//lista de números inteiros, usamos o Wrapper Class que é esse Integer, Double, etc porque ela nao aceita tipos primitivos (int double etc)

		List <String> lista = new ArrayList<>();

		lista.add("buiu");
		lista.add("ca");
		lista.add("co");
		lista.add("de");
		lista.add("camisetas por minuto");


		//inserir um elemento entre outros
		//posição 2 da lista coloque o valor 9
		lista.add(2,"uber");

		//para mostrar o tamanho da lista usamos o size()
		System.out.println(lista.size());


		//LAÇO FOREACH EM JAVA
		//para cada string x que está na lista, imprima na tela seu valor;
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("----------------------------------------------------------");


		//para remover de uma lista posso colocar a posição
		//a lista se organiza automaticamente
		//pode ser lista.remove("nome"), ele faz a comparação das strings tambem.
		lista.remove(1);


		//há uma forma de remover da lista pelo PREDICADO
		//se no valor X, apontando pro char inicial for p, apague.
		lista.removeIf(x -> x.charAt(0)=='b'); //isso é uma expressão lambda
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("----------------------------------------------------------");
		//para encontrar a POSIÇÃO DE UM ELEMENTO
		//utiliza-se o indexOf() e ele retorna o valor. se não encontrar, retorna -1
		System.out.println("Index of buiu: "+lista.indexOf("cuiu"));

		System.out.println("----------------------------------------------------------");

		//para filtrarmos uma lista só com o que queremos, é necessário fazer uma lista nova
		//precisamos converter para stream usando o stream().filter pra FILTRAR, dentro colocamos o PREDICADO
		//depois disso, precisamos transformar os resultados em uma lista novamente, usando .collect (Collectors.toList());
		List<String> resultado = lista.stream().filter(x-> x.charAt(0)=='c').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);
		}

		System.out.println("----------------------------------------------------------");
		//para encontrar o primeiro elemento começado por uma letra
		//precisamos de uma nova variável pra receber o primeiro elemento, nesse caso é uma String
		//transformar pra stream com lista.stream, depois filtrar a stream com .filter(expressão lambda)
		//para retornar o primeiro item, será necessário usar o .findFirst; 
		//caso não encontre nada, precisamos garantir que retorne nulo, por isso colocamos .orElse(null);
		String nome = lista.stream().filter(x-> x.charAt(0)=='c').findFirst().orElse(null);
		System.out.println(nome);
	}

}
