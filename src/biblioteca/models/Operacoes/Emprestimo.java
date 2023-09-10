package biblioteca.models.Operacoes;

import biblioteca.models.Membro.*;
import biblioteca.models.itens.*;
import biblioteca.models.Biblioteca.*;
import java.util.*;


public class Emprestimo  {
	//Atributos
			private String itemEmprestado;
			private String solicitanteDoEmprestimo;
			private String DataDoEmprestimo;
			private String DataDeDevolucao;

			
			//Construtor
			public Emprestimo(String itemEmprestado, String solicitanteDoEmprestimo, String DataDoEmprestimo, String DataDeDevolucao) {
				this.itemEmprestado = itemEmprestado;
				this.solicitanteDoEmprestimo = solicitanteDoEmprestimo;
				this.DataDoEmprestimo = DataDoEmprestimo;
				this.DataDeDevolucao = DataDeDevolucao;
			}
			
			//Getters e setters
			public String getitemEmprestado() {
				return itemEmprestado;
			}
			public void setitemEmprestado(String itemEmprestado) {
				this.itemEmprestado = itemEmprestado;
			}
			
			public String getsolicitanteDoEmprestimo() {
				return solicitanteDoEmprestimo;
			}
			public void setsolicitanteDoEmprestimo(String solicitanteDoEmprestimo) {
				this.solicitanteDoEmprestimo = solicitanteDoEmprestimo;
			}
			
			public String getDataDoEmprestimo() {
				return DataDoEmprestimo;
			}
			public void setDataDoEmprestimo(String DataDoEmprestimo) {
				this.DataDoEmprestimo = DataDoEmprestimo;
			}
			
			public String getDataDeDevolucao() {
				return DataDeDevolucao;
			}
			public void setDataDeDevolucao(String DataDeDevolucao) {
				this.DataDeDevolucao = DataDeDevolucao;
			}
	
}
	
