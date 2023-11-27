package model;

public class PacoteAventura extends pacote {
	
	//Atributos
	
		private boolean trilha;
		private boolean escalada;
		
	//Construtor
		
		public PacoteAventura(boolean trilha, boolean escalada, String origem, String destino, String dataDeIda, String dataDeVolta,  int numeroDePessoas, String companhiaAerea, String preco) {
			
			super(origem, destino, dataDeIda, dataDeVolta, numeroDePessoas, companhiaAerea, preco);
			
		}
		
	//Polimorfismo de sobrescrita
		
		@Override
		public void hotel(int diasDeEstadia) {
			
		}
		
		
}
