package biblioteca.models.itens;

public class Outros extends Item {
	//Atributos
		private String tipo;
		private String formato;
		private String estadoConservacao;
		
		//Construtor
		public Outros(String tipo, String formato, String estadoConservacao, String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String capa) {
			super (titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
			this.tipo = tipo;
			this.formato = formato;
			this.estadoConservacao = estadoConservacao;
		}
		
		//Getters e setters
		public String gettipo() {
			return tipo;
		}
		public void settipo(String tipo) {
			this.tipo = tipo;
		}
		
		public String getformato() {
			return formato;
		}
		public void setformato(String formato) {
			this.formato = formato;
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
