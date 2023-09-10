package biblioteca.models.salasEequipamentos;

public class EventosBiblioteca {
	
	//classes internas
	class Palestra {
		private String palestrante;
		private String topico;
		private String data;
		private String horario;
		private String local;
	}
	
	class Workshop {
		private String instrutor;
		private String topico;
		private String materiaisNecessarios;
		private String data;
		private String horario;
		private String local;
	}
	
	class Exposicao {
		private String expositores;
		private String tema;
		private String data;
		private String horario;
		private String local;	
	}
	
	enum TipoDeEvento {
		PALESTRA, WORKSHOP, EXPOSICAO
	}

}
