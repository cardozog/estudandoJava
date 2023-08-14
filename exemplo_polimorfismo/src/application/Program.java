package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	//POLIMORFISMO: VARIÁVEIS DO MESMO TIPO SE COMPORTANDO DE FORMAS DIFERENTES DEPENDENDO DO "CONTEXTO"
	//MESMA IDEIA DO UPCASTING

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int n,hours;
		double valuePerHour,additionalCharge;
		char outSourced;
		String name;
		Employee employee;

		List<Employee> listaEmpregados = new ArrayList<>();

		System.out.print("Quantos funcionários são no total?: ");
		n=sc.nextInt();

		for(int i=0;i<n ; i++) {
			sc.nextLine();
			System.out.println("Informações do funcionário #"+(i+1));

			System.out.print("Nome do funcionário: ");
			name=sc.nextLine();

			System.out.print("Funcionário terceirizado? (y/n): ");
			outSourced=sc.next().charAt(0);

			System.out.print("Quantidade de horas trabalhadas: ");
			hours=sc.nextInt();

			System.out.print("Valor da hora trabalhada: ");
			valuePerHour=sc.nextDouble();



			if(outSourced=='y') {
				System.out.print("Despesa adicional: ");
				additionalCharge=sc.nextDouble();

				employee= new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);

			}else {

				employee= new Employee(name,hours,valuePerHour);

			}
			listaEmpregados.add(employee);
		}
		System.out.println("PAGAMENTOS: ");

		for (Employee emp : listaEmpregados) {
			System.out.println(emp.getName()+" - R$"+emp.payment());
		}

		sc.close();
	}

}
