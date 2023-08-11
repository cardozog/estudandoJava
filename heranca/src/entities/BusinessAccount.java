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
}
