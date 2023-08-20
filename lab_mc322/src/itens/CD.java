package itens;

public class CD {
	//Atributos
		private String ismn;
		private String codigoDeBarras;
		private String titulo;
		private String artista;
		private String editora;
		private String dataLancamento; 
		
		//Construtor
		public CD(String ismn, String codigoDeBarras, String titulo, String artista, String editora, String dataLancamento) {
			this.ismn = ismn;
			this.codigoDeBarras = codigoDeBarras;
			this.titulo = titulo;
			this.artista = artista;
			this.editora = editora;
			this.dataLancamento = dataLancamento;
		}
		
		//Getters e setters
		public String getismn() {
			return ismn;
		}
		public void setismn(String ismn) {
			this.ismn = ismn;
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
		
		public String getartista() {
			return artista;
		}
		public void setartista(String artista) {
			this.artista = artista;
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
