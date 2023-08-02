package entities;

import java.util.Date;

public class Contrato {
	private Date data;
	private Double valorHora;
	private Integer qtdHoras;


	public Contrato ()
	{
	}


	public Contrato(Date data, Double valorHora, Integer qtdHoras) {
		this.data = data;
		this.valorHora = valorHora;
		this.qtdHoras = qtdHoras;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValorHora() {
		return valorHora;
	}


	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}


	public Integer getQtdHoras() {
		return qtdHoras;
	}


	public void setQtdHoras(Integer qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double valorTotal(){
		return qtdHoras*valorHora;
	}



}
