package services;

import java.util.ArrayList;
import java.util.List;

//<T> INDICA UM TIPO GENÉRICO PARA QUANDO INSTANCIAR, DEFINIRMOS OBRIGATORIAMENTE UM TIPO
public class PrintServices<T> {

	private List<T> lista = new ArrayList<>();

	public void addValue(T value) {
		lista.add(value);
	}

	public T first() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("vazia lista");
		}
		return lista.get(0);
	}

	public void print() {
		if (!lista.isEmpty()) {
			System.out.print("[");
			for (T item : lista) {
				System.out.print(" " + item + ",");
			}
			System.out.println("]");
		} else {
			System.out.println("Lista vazia!");
		}
	}

}
