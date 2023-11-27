package model;

public class pacoteCultura extends pacote {
	
	//Atributos
	
		private boolean showMusical;
		private boolean museu;
		
	//Construtor
		
		public pacoteCultura(boolean showMusical, boolean museu, String origem, String destino, String dataDeIda, String dataDeVolta,  int numeroDePessoas, String companhiaAerea, String preco) {
			
			super(origem, destino, dataDeIda, dataDeVolta, numeroDePessoas, companhiaAerea, preco);
			
			this.showMusical = showMusical;
			this.museu = museu;

			
		}
		
	//Polimorfismo de sobrescrita
		
		@Override
		public void hotel(int diasDeEstadia) {
					
		}

}
