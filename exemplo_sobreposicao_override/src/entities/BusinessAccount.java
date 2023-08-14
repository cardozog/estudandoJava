package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;

	public BusinessAccount() {

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//super é pra executar a lógica do construtor da classe base (também chamada de superclasse ou classe pai)
		super(number, holder, balance);

		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if(amount <=loanLimit) {
			balance += amount -10.0;
		}
	}
	
	//INDICAR AO COMPILADOR QUE É UMA SOBREPOSIÇÃO DE MÉTODO usamos a anotação @override
	@Override
	//o compilador procura o método na superclasse que no caso é Account
	
	public void withdraw(Double amount) {
		//esse super quer dizer que na superclasse, nós vamos usar o método de saque de lá
		//pra aqui descontar 2 do balanço 
		super.withdraw(amount);
		balance -= 2.0;
	}
}
