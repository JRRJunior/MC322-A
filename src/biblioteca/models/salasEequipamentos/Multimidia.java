package biblioteca.models.salasEequipamentos;

public class Multimidia {
	
	class Audio {
		private String detalhesCds;
		private String podcasts;
		private String gravacoesDePalestras;
	}
	
	class Video {
		private String detalhesDvds;
		private String gravacoesDeAulas;
		private String documentarios;
	}
	
	class Software {
		private String softwaresEducacionais;
		private String programasDeSimulacao;
	}
	
	enum FormatoMultimidia {
		AUDIO, VIDEO, SOFTWARE
	}

}
