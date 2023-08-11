package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc= new Account(1001,"guizin",0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"gabforeve",0.0,500.0);


		//UPCASTING 
		//consiste em atribuir o conteudo de um objeto da subclasse a um objeto da superclasse
		Account acc1 = bacc;
		//não dá erro porque business account também é uma account, assim como savings account
		Account acc2= new BusinessAccount(1003,"gabzinhaforeve",0.0,500.0);
		Account acc3 = new SavingsAccount(1004,"uber",0.0,500.0);

		//DOWNCASTING 
		//ao invés de atribuirmos uma classe filha à classe pai, fazemos o contrario
		//como é o caminho contrário disso tudo, a troca direta não é natural. precisamos usar o casting pra forçar
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//pode dar erro\/
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		//para contornar esse erro que acontece pq o compilador não sabe se a acc3 é valida 
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
		}
		//SE acc FOR UMA INSTÂNCIA DE SavingsAccount
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
		}
		sc.close();
	}

}
