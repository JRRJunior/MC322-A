package biblioteca.models.itens;

public class Item {
	//Atributos
		private String titulo;
		private String autor;
		private String editora;
		private int anoPublicacao;
		private String genero;
		private String sinopse;
		private String capa;
		
		//Construtor
		public Item(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String capa) {
			this.titulo = titulo;
			this.autor = autor;
			this.editora = editora;
			this.anoPublicacao = anoPublicacao;
			this.genero = genero;
			this.sinopse = sinopse;
			this.capa = capa;
		}
		
		//Getters e setters
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
		
		public int getanoPublicacao() {
			return anoPublicacao;
		}
		public void setanoPublicacao(int anopublicacao) {
			this.anoPublicacao = anoPublicacao;
		}
		
		public String getgenero() {
			return genero;
		}
		public void setgenero(String genero) {
			this.genero = genero;
		}
		
		public String getsinopse() {
			return sinopse;
		}
		public void setsinopse(String sinopse) {
			this.sinopse = sinopse;
		}
		
		public String getcapa() {
			return capa;
		}
		public void setcapa(String capa) {
			this.capa = capa;
		}

}
