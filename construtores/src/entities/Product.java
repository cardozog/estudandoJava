package entities;

public class Product {
	public String nome;
	public double price;
	public int quantity;

	public Product() {
		//essa é a versão base de um construtor, onde todos os atributos serão carregados com o valor padrão(null ou 0 dependendo do tipo de variável)
		//a vantagem é que as três versões do construtor funcionam, tudo depende da forma que vamos instanciar o objeto.
	}
	
	//isso é um construtor, ele é carregado no momento que instanciamos um objeto (usando new Project() por exemplo)
	//esse construtor é feito dessa forma para garantir consistencia no código, para garantir que um objeto tenha sempre um valor
	public Product(String nome, double price, int quantity) {
		//usar esse this, a gente está se referindo ao ATRIBUTO do objeto, não à variavel local que por convenção tem o mesmo nome.
		this.nome = nome;
		this.price = price;
		this.quantity=quantity;
		
	}
	
	
	//Criando um construtor de mesmo nome para fazer SOBRECARGA, onde ele pode carregar alguns atributos apenas ou nenhum.
	//SOBRECARGA é disponibilizar mais de uma versão da mesma operação.
	//O java inicia os atributos por padrão como 0 ao instanciar se não tiver valor atribuído.
	public Product(String nome, double price) {
		//usar esse this, a gente está se referindo ao ATRIBUTO do objeto, não à variavel local que por convenção tem o mesmo nome.
		this.nome = nome;
		this.price = price;
		
	}


	//valor total em R$ que temos no estoque
	public double totalValueInStock() {
		return price * quantity;
	}

	//adicionar produtos à quantidade antiga.
	public void addProducts(int quantity) {
		this.quantity +=quantity;
	}

	//o this é usado pra referenciar o parâmetro dessa mesma classe, pra diferenciar do parâmetro da função
	public void removeProducts(int quantity) {
		this.quantity -=quantity;
	}

	public String toString() {
		return "Produto: "+ nome+" | Preço: R$"+ price +" | Quantidade: " + quantity+" | Valor total em estoque: R$"+totalValueInStock();
	}

}
