package entities;

public class Product {

	//MODIFICADORES DE ACESSO são quando cada atributo tem um nível, por exemplo private, protected ou sem nada 
	
	
	//PUBLIC pode ser acessado por qualquer classe em qualquer lugar.
	
	
	//quando não tem nada definindo a prioridade, o atributo só é acessivel para classes do MESMO PACOTE.
	//portanto, quem estiver em application não consegue ver
	String nome;
	
	//no caso do PRIVATE, o acesso só pode ser feito pela própria classe.
	private double price;
	private int quantity;

	
	//no caso do PROTECTED, o membro pode ser acessado por outras classes do mesmo pacote
	//e também em subclasses (herança) de pacotes diferentes.

	public Product() {
	}


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

	//para acessarmos os valores de cada atributo, utilizamos getters e setters.
	//getters são funções PÚBLICAS classe que retornam o valor do atributo PRIVATE para a main.
	//a sintaxe é sempre assim:
	public String getNome() {
		return nome;
	}

	// e setters são void porque não precisam retornar nada, só vão mudar um valor mesmo	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	//a quantidade só muda quando há entrada ou saída, é uma questão de proteção não ter uma função que altere diretamente o valor em si.
	/*	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}*/




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
