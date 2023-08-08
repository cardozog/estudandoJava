package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date momentoPost;
	private String tituloPost;
	private String conteudo;
	private Integer numeroLikes;
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	public Post() {

	}

	public Post(Date momentoPost, String tituloPost, String conteudo) {
		this.momentoPost = momentoPost;
		this.tituloPost = tituloPost;
		this.conteudo = conteudo;
		this.numeroLikes = 0;
	}

	public Date getMomentoPost() {
		return momentoPost;
	}

	public void setMomentoPost(Date momentoPost) {
		this.momentoPost = momentoPost;
	}

	public String getTituloPost() {
		return tituloPost;
	}

	public void setTituloPost(String tituloPost) {
		this.tituloPost = tituloPost;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getNumeroLikes() {
		return numeroLikes;
	}

	public void setNumeroLikes() {
		this.numeroLikes++;
	}

	public List<Comentario> getComentario() {
		return comentarios;
	}

	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(int idComentario) {
		comentarios.remove(idComentario);
	}


}
