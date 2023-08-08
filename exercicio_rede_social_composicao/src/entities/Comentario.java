package entities;

public class Comentario {
	private String texto;
	private Post post;
	
	public Comentario() {}
	
	public Comentario(String texto, Post post) {
		super();
		this.texto = texto;
		this.post = post;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	

}

