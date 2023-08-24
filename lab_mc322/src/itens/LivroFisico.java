package itens;

public class LivroFisico {
	//Atributos
	private String isbn;
	private String codigoDeBarras;
	private String titulo;
	private String autor;
	private String editora;
	private String dataLancamento;
	
	//Construtor
	public LivroFisico(String isbn, String codigoDeBarras, String titulo, String autor, String editora, String dataLancamento) {
		this.isbn = isbn;
		this.codigoDeBarras = codigoDeBarras;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.dataLancamento = dataLancamento;
	}
	
	//Getters e setters
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getcodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setcodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
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
	
	public String geteditora() {
		return editora;
	}
	public void seteditora(String editora) {
		this.editora = editora;
	}
	
	public String getdataLancamento() {
		return dataLancamento;
	}
	public void setdataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
}
