package entities;

import java.sql.Date;

public class Order {

	private Date date;
	private Product product;

	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		//não tendo o controle de acesso definido, podemos alterar diretamente o atributo sem uso de métodos \/
		this.product.nome="TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


}
