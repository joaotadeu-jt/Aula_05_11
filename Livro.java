package aula_05_11;

public class Livro {
	private String titulo;
	private Autor autor;
	
	public Livro(String nome, String autor) {
		this.titulo = nome;
		this.autor = new Autor (autor);
		}

	public String getTitulo() {
		return titulo;
	}

	public void setNome(String nome) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor.getNome();
	}

	
}
