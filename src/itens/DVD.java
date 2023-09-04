package itens;

public class DVD extends Item {
	//Atributos
		private String elenco; 
		private String duracao;
		private String legendasEaudiosDisponiniveis;
		private String estadoConservacao;
		
		//Construtor
		public DVD(String elenco, String duracao, String legendasEaudiosDisponiniveis, String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String capa) {
			super (titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
			this.elenco = elenco;
			this.duracao = duracao;
			this.legendasEaudiosDisponiniveis = legendasEaudiosDisponiniveis;
			this.estadoConservacao = estadoConservacao;
		}
		
		//Getters e setters
		public String getelenco() {
			return elenco;
		}
		public void setelenco(String elenco) {
			this.elenco = elenco;
		}
		
		public String getduracao() {
			return duracao;
		}
		public void setduracao(String duracao) {
			this.duracao = duracao;
		}
		
		public String getlegendasEaudiosDisponiniveis() {
			return legendasEaudiosDisponiniveis;
		}
		public void setlegendasEaudiosDisponiniveis(String legendasEaudiosDisponiniveis) {
			this.legendasEaudiosDisponiniveis = legendasEaudiosDisponiniveis;
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
}
