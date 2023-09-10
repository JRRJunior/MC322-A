package biblioteca.models.salasEequipamentos;

public class ReservaSala {
	private String dataReserva;
	private String horaInicio;
	private String horaFim;
	
	//classes internas
	class SalaIndividual {
		private boolean computadorDisponivel;
		private int numeroSala;
	}
	
	class SalaGrupo {
		private int capacidadeMaximaDePessoas;
		private boolean possuiEquipDeApresentacao;
	}
	
	class SalaSilenciosa {
		private int numeroAssentos;
		private boolean cabineIndividual;
	}
	
	class SalaMultimidia {
		private String computador;
		private String equipCapturaDeAundio;
	}
	
	enum StatusReserva {
		PENDENTE, CONFIRMADA, CANCELADA
	}

}
