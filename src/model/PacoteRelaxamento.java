package model;

public class PacoteRelaxamento extends pacote {
	
	//Atributos
	
		private boolean spa;
		private boolean hotelFazenda;
		
	//Construtor
		
		public PacoteRelaxamento(boolean spa, boolean hotelFazenda, String origem, String destino, String dataDeIda, String dataDeVolta,  int numeroDePessoas, String companhiaAerea, String preco) {
			
			super(origem, destino, dataDeIda, dataDeVolta, numeroDePessoas, companhiaAerea, preco);
			
		}
		
	//Polimorfismo de sobrescrita
		
		@Override
		public void hotel(int diasDeEstadia) {
			
		}
		
}