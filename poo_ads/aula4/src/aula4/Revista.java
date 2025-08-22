package aula4;

public class Revista {
	
	private String autor;
	private String titulo;
	private String editora;
	
	public String getTitulo() {
		return this.titulo.toUpperCase();
	}
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
