package model;

abstract class pacote {
	
	//Atributos
	
		private String origem;
		private String destino;
		private String dataDeIda;
		private String dataDeVolta;
		private int numeroDePessoas;
		private String companhiaAerea;
		private String preco;
		
	//Construtor
		
		public pacote(String origem, String destino, String dataDeIda, String dataDeVolta, int numeroDePessoas, String companhiaAerea, String preco) {
			
			this.origem = origem;
			this.destino = destino;
			this.dataDeIda = dataDeIda;
			this.dataDeVolta = dataDeVolta;
			this.numeroDePessoas = numeroDePessoas;
			this.companhiaAerea = companhiaAerea;
			this.preco = preco;
		}
		
	//Métodos
		
		public void hotel(int diasDeEstadia) {
			
		}
		
	//Tipos de pacotes
		
		enum pacotes{
			Aventura, Cultura, Relaxamento
		}

}
