package model;

public class pacoteCompleto extends pacote {
	
	//Atributos
	
		private String horaTansladoIda;
		private String horaTansladoVolta;
		private String empresaResponsavelTranslado;
		private String PasseiosOpcionais;
		
	//Construtor
		
		public pacoteCompleto(String horaTransladoIda, String horaTransladoVolta, String empresaResponsavelTranslado, String passeiosOpcionais, String origem, String destino, String dataDeIda, String dataDeVolta,  int numeroDePessoas, String companhiaAerea) {
			
			super(origem, destino, dataDeIda, dataDeVolta, numeroDePessoas, companhiaAerea);
			
			this.horaTansladoIda = horaTansladoIda;
			this.horaTansladoVolta = horaTansladoVolta;
			this.empresaResponsavelTranslado = empresaResponsavelTranslado;
			this.PasseiosOpcionais = PasseiosOpcionais;
			
		}
		
	//Polimorfismo de sobrecarga
		
		public void hotel(int diasDeEstadia,boolean tudoIncluso) {
					
		}

}
