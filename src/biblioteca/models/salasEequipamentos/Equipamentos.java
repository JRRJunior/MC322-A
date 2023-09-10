package biblioteca.models.salasEequipamentos;

public class Equipamentos {
	
	class Informatica {
		private String especificacoesComputadores;
		private boolean tabletDisponivel;
		private boolean projetorDisponivel;
	}
	
	class Audiovisual {
		private boolean cameraDisponivel;
		private boolean microfoneDisponivel;
		private boolean caixaDeSomDisponivel;	
	}
	
	class Impressao {
		private boolean impressoraDisponivel;
		private boolean scannerDisponivel;
		private boolean copiadoraDisponivel;
	}
	
	enum CategoriaEquipamento {
		INFORMATICA, AUDIOVISUAL, IMPRESSAO
	}

}
