package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {


	public static Integer posicaoLista(List<Funcionario> lista, Integer id) {
		for (int i=0;i<lista.size();i++) {

			if (lista.get(i).getId()==id) { //lista na posição(numero)
				return i;
			}
		}
		return null;
	}


	public static void listarFuncionarios(List<Funcionario> lista) {

		for (Funcionario func : lista) {
			System.out.println("+============================================+");
			System.out.println("FUNCIONÁRIO");
			System.out.println("ID: "+func.getId());
			System.out.println("NOME: "+func.getNome());
			System.out.println("SALÁRIO: R$ "+func.getSalario());
			System.out.println("+============================================+");
		}
	}


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		Funcionario funcionario;
		Integer id,n;
		String nome;
		Double salario,percentual;

		System.out.print("Insira o número de funcionários: ");
		n =sc.nextInt();

		for (int i=0 ;i<n;) {
			System.out.print("Insira o ID do funcionário: ");
			id=sc.nextInt();

			if (posicaoLista(funcionarios,id) == null) {

				System.out.print("Insira o NOME do funcionário");
				sc.nextLine();
				nome = sc.nextLine();

				System.out.print("Insira o salário do funcionario: R$");
				salario=sc.nextDouble();

				funcionario = new Funcionario(id,nome,salario);
				funcionarios.add(funcionario);
				i++;
			}
			else {
				System.out.println("ESSE ID JÁ EXISTE, TENTE NOVAMENTE");
			}
		}

		listarFuncionarios(funcionarios);
		System.out.print("Deseja aumentar o salário de qual funcionário? Digite o ID: " );
		id=sc.nextInt();	
		while(posicaoLista(funcionarios, id)==null) {
			System.out.print("ID NÃO ENCONTRADO! Digite um id válido" );
			id=sc.nextInt();
		} 
		Integer posicao = posicaoLista(funcionarios, id);
		System.out.print("Digite o percentual a ser adicionado ao salário do funcionário "+ funcionarios.get(posicao).getNome()+": ");
		percentual= sc.nextDouble();

		funcionarios.get(posicao).setSalario(percentual);

		listarFuncionarios(funcionarios);


		sc.close();
	}

}
