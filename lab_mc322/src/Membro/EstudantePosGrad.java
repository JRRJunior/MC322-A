package Membro;

import java.util.*;
import Operacoes.Emprestimo;

public class EstudantePosGrad {
	//Atributos
		private String nome;
		private String endereco;
		private String email;
		private String telefone;
		private int cadastroBiblioteca;
		private int ra;
		private Set<Emprestimo> emprestimos;
		
		//Construtor
		public EstudantePosGrad(String nome, String endereco, String email, String telefone, int cadastroBiblioteca, int ra) {
			this.nome = nome;
			this.endereco = endereco;
			this.email = email;
			this.telefone = telefone;
			this.cadastroBiblioteca = cadastroBiblioteca;
			this.ra = ra;
		}
		
		//Getters e setters
		public String getnome() {
			return nome;
		}
		public void setnome(String nome) {
			this.nome = nome;
		}
		
		public String getendereco() {
			return endereco;
		}
		public void setendereco(String endereco) {
			this.endereco = endereco;
		}
		
		public String getemail() {
			return email;
		}
		public void setemail(String email) {
			this.email = email;
		}
		
		public String gettelefone() {
			return telefone;
		}
		public void settelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public int getcadastroBiblioteca() {
			return cadastroBiblioteca;
		}
		public void setcadastroBiblioteca(int cadastroBiblioteca) {
			this.cadastroBiblioteca = cadastroBiblioteca;
		}
		
		public int getra() {
			return ra;
		}
		public void setra(int ra) {
			this.ra = ra;
		}
		
		public Set<Emprestimo> getemprestimos(Set<Emprestimo> emprestimos){
			return this.emprestimos;
		}
		public void setemprestimos(Set<Emprestimo> emprestimos) {
			this.emprestimos = emprestimos;
		}


}
