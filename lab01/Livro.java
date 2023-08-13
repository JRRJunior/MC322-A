package Livro;

public class Livro {
	//Atributos
	private String isbn; 
	private String titulo;
	private String autor;
	private int dataPublicacao; 
	
	//Construtor
	public Livro(String isbn, String titulo, String autor, int dataPublicacao) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
	}
	
	//Getters e setters
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String gettitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getautor() {
		return autor;
	}
	public void setautor(String autor) {
		this.autor = autor;
	}
	
	public int getdataPublicacao() {
		return dataPublicacao;
	}
	public void setdataPublicacao(int dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	

}
