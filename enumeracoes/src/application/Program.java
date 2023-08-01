package application;

import java.util.Date;

import entites.enums.StatusPedido;
import entities.Pedido;

public class Program {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080,new Date(),StatusPedido.AGUARDANDO_PAGAMENTO);

		System.out.println(pedido);

		//é possível definir o status através de uma string

		StatusPedido os = StatusPedido.PROCESSANDO;

		System.out.println(os);

		os = StatusPedido.valueOf("AGUARDANDO_PAGAMENTO");

		System.out.println(os);
	}

}
