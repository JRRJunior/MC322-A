package itens;

public class CD extends Item {
	//Atributos
		private String listaDeFaixas;
		private String duracaoTotal;
		private String estadoConservacao; 
		
		//Construtor
		public CD(String listaDeFaixas, String duracaoTotal, String estadoConservacao, String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String capa) {
			super (titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
			this.listaDeFaixas = listaDeFaixas;
			this.duracaoTotal = duracaoTotal;
			this.estadoConservacao = estadoConservacao;
		}
		
		//Getters e setters
		public String getlistaDeFaixas() {
			return listaDeFaixas;
		}
		public void setlistaDeFaixas(String listaDeFaixas) {
			this.listaDeFaixas = listaDeFaixas;
		}
		
		public String getduracaoTotal() {
			return duracaoTotal;
		}
		public void setduracaoTotal(String duracaoTotal) {
			this.duracaoTotal = duracaoTotal;
		}
		
		public String getestadoConservacao() {
			return estadoConservacao;
		}
		public void setestadoConservacao(String estadoConservacao) {
			this.estadoConservacao = estadoConservacao;
		}
		
}
