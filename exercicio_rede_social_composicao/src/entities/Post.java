package entities;

import java.util.Date;

public class Post {
	private Date momentoPost;
	private String tituloPost;
	private String conteudo;
	private Integer numeroLikes;

	public Post() {

	}

	public Post(Date momentoPost, String tituloPost, String conteudo, Integer numeroLikes) {
		this.momentoPost = momentoPost;
		this.tituloPost = tituloPost;
		this.conteudo = conteudo;
		this.numeroLikes = numeroLikes;
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

	public void setNumeroLikes(Integer numeroLikes) {
		this.numeroLikes = numeroLikes;
	}



}
