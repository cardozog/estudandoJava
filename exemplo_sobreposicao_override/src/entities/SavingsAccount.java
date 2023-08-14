package entities;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		
		super(number, holder, balance);
		this.interestRate = interestRate;
		
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance*interestRate;
	}
	
	//INDICAR AO COMPILADOR QUE É UMA SOBREPOSIÇÃO DE MÉTODO usamos a anotação @override
	@Override
	//o compilador procura o método na superclasse que no caso é Account
	public void withdraw(Double amount) {
		balance -= amount;
	}
}
