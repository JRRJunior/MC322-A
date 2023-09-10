package biblioteca.models.itens;

public class LivroFisico extends Item{
	//Atributos
	private int isbn;
	private int edicao;
	private String estadoConservacao;
	
	//construtor
	public LivroFisico(int isbn, int edicao, String estadoConservacao, String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String capa) {
		super (titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
		this.isbn = isbn;
		this.edicao = edicao;
		this.estadoConservacao = estadoConservacao;
	}
		
		//Getters e setters
		public int getisbn() {
			return isbn;
		}
		public void setisbn(int isbn) {
			this.isbn = isbn;
		}
		
		public int getedicao() {
			return edicao;
		}
		public void setedicao(int edicao) {
			this.edicao = edicao;
		}
		
		public String getestadoConservacao() {
			return estadoConservacao;
		}
		public void setestadoConservacao(String estadoConservacao) {
			this.estadoConservacao = estadoConservacao;
		}
		
		//métodos
		public int numeroDeCopias() {
			return 0;
		}
		
		public int numeroDeCopiasDisponiveis() {
			return 0;
		}
		
		public String localizacaoBiblioteca() {
			return null;
		}
}
