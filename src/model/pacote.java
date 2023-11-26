package model;

abstract class pacote {
	
	//Atributos
	
		private String origem;
		private String destino;
		private String dataDeIda;
		private String dataDeVolta;
		private int numeroDePessoas;
		private String companhiaAerea;
		
	//Construtor
		
		public pacote(String origem, String destino, String dataDeIda, String dataDeVolta, int numeroDePessoas, String companhiaAerea) {
			
			this.origem = origem;
			this.destino = destino;
			this.dataDeIda = dataDeIda;
			this.dataDeVolta = dataDeVolta;
			this.numeroDePessoas = numeroDePessoas;
			this.companhiaAerea = companhiaAerea;
		}
		
	//Métodos
		
		public void hotel(int diasDeEstadia) {
			
		}

}
