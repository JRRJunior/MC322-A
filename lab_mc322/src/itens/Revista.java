package itens;

public class Revista {
	//Atributos
		private String issn;
		private String codigoDeBarras;
		private String titulo;
		private String editora;
		private String dataLancamento; 
		
		//Construtor
		public Revista(String isbn, String codigoDeBarras, String titulo, String editora, String dataLancamento) {
			this.issn = isbn;
			this.codigoDeBarras = codigoDeBarras;
			this.titulo = titulo;
			this.editora = editora;
			this.dataLancamento = dataLancamento;
		}
		
		//Getters e setters
		public String getissn() {
			return issn;
		}
		public void setissn(String issn) {
			this.issn = issn;
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
