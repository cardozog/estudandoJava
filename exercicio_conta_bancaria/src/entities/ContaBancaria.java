package entities;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
		System.out.println("vamo ver");
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public ContaBancaria(int numeroConta, String nomeTitular) {
		System.out.println("vamo ver");
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String toString() {
		return "Número da conta: "
				+ getNumeroConta()
				+ " | "
				+"Nome: "
				+ getNomeTitular()
				+" | "
				+"Saldo: R$"
				+String.format("%.2f",getSaldo());
	}

	public boolean saque(double valor) {
		valor +=5;
		if (saldo >0 && saldo > valor) 
		{
			this.saldo= (saldo-valor);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean deposito(double valor) {
		if (valor > 0) {
			this.saldo+=valor;
			return true;
		}
		else {
			return false;
		}
	}

}

