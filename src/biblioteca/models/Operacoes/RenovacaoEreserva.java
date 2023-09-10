package biblioteca.models.Operacoes;

import biblioteca.models.Membro.*;
import biblioteca.models.itens.*;

public class RenovacaoEreserva {
	//Atributos
			private String itemRenovado;
			private String itemReservado;
			private String solicitanteDeRenovacao;
			private String solicitanteDeReserva;
			private String DataRenovacao;
			private String NovaDataDevolucao;
			private String DataReserva;

			
			//Construtor
			public RenovacaoEreserva(String itemRenovado, String itemReservado, String solicitanteDeRenovacao, String solicitanteDeReserva, String DataRenovacao, String NovaDataDevolucao, String DataReserva) {
				this.itemRenovado = itemRenovado;
				this.itemReservado = itemReservado;
				this.solicitanteDeRenovacao = solicitanteDeRenovacao;
				this.solicitanteDeReserva = solicitanteDeReserva;
				this.DataRenovacao = DataRenovacao;
				this.NovaDataDevolucao = NovaDataDevolucao;
				this.DataReserva = DataReserva;
			}
			
			//Getters e setters
			public String getitemRenovado() {
				return itemRenovado;
			}
			public void setitemRenovado(String itemRenovado) {
				this.itemRenovado = itemRenovado;
			}
			
			public String getitemReservado() {
				return itemReservado;
			}
			public void setitemReservado(String itemReservado) {
				this.itemReservado = itemReservado;
			}
			
			public String getsolicitanteDeRenovacao() {
				return solicitanteDeRenovacao;
			}
			public void setsolicitanteDeRenovacao(String solicitanteDeRenovacao) {
				this.solicitanteDeRenovacao = solicitanteDeRenovacao;
			}
			
			public String getsolicitanteDeReserva() {
				return solicitanteDeReserva;
			}
			public void setsolicitanteDeReserva(String solicitanteDeReserva) {
				this.solicitanteDeReserva = solicitanteDeReserva;
			}
			
			public String getDataRenovacao() {
				return DataRenovacao;
			}
			public void setDataRenovacao(String DataRenovacao) {
				this.DataRenovacao = DataRenovacao;
			}
			
			public String getNovaDataDevolucao() {
				return NovaDataDevolucao;
			}
			public void setNovaDataDevolucao(String NovaDataDevolucao) {
				this.NovaDataDevolucao = NovaDataDevolucao;
			}
			
			public String getDataReserva() {
				return DataReserva;
			}
			public void setDataReserva(String DataReserva) {
				this.DataReserva = DataReserva;
			}
}
