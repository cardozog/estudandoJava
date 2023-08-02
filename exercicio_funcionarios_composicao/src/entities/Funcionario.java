package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelFuncionario;

public class Funcionario {
	private String nome;
	private NivelFuncionario nivel;
	private Double salarioBase;
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();


	public Funcionario() {
	}


	public Funcionario(String nome, NivelFuncionario nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public NivelFuncionario getNivel() {
		return nivel;
	}


	public void setNivel(NivelFuncionario nivel) {
		this.nivel = nivel;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<Contrato> getContratos() {
		return contratos;
	}

	public void adicionarContrato(Contrato contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(Contrato contrato) {
		contratos.remove(contrato);
	}

	public double valorAReceber(Integer mes, Integer ano) {
		double soma=salarioBase;
		//criar uma instancia de um calendario temporario
		Calendar calendario = Calendar.getInstance();

		//para cada contrato da lista de contratos, faça
		for(Contrato contrato: contratos) {
			//setando no calendario temporario a data de cada contrato
			calendario.setTime(contrato.getData());

			//atribuição do mês e ano para variaveis de valor int;
			int mesCalendario = calendario.get(Calendar.MONTH);
			int anoCalendario = calendario.get(Calendar.YEAR);

			if(mes== mesCalendario && ano ==anoCalendario)	{
				soma+= contrato.valorTotal();
			}
		}
		return soma;


	}



}
