package entities;

import java.util.Date;

import entites.enums.StatusPedido;

public class Pedido {
	private Integer id;
	private Date instante;
	private StatusPedido status;

	public Pedido(Integer id, Date instante, StatusPedido status) {
		super();
		this.id = id;
		this.instante = instante;
		this.status = status;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", Instante=" + instante + ", Status=" + status + "]";
	}


}
