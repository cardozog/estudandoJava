package entities;

//PARA EVITAR QUE ESSA CLASSE SAVINGSACCOUNT SEJA HERDADA, COLOCAMOS O final NA DECLARAÇÃO
public final class SavingsAccount extends Account{

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
	public final void withdraw(Double amount) {
		//PARA EVITAR QUE ESSE METODO WITHDRAW SEJA REESCRITO, COLOCAMOS O final NA DECLARAÇÃO
		
		balance -= amount;
	}
}
