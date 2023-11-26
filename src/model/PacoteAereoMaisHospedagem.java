package model;

public class PacoteAereoMaisHospedagem extends pacote {
		
	//Construtor
		
		public PacoteAereoMaisHospedagem(String origem, String destino, String dataDeIda, String dataDeVolta,  int numeroDePessoas, String companhiaAerea) {
			
			super(origem, destino, dataDeIda, dataDeVolta, numeroDePessoas, companhiaAerea);
			
		}
		
	//Polimorfismo de sobrecarga
		
		public void hotel(int diasDeEstadia,boolean cafeDaManhaIncluso) {
			
		}
		
		
}
