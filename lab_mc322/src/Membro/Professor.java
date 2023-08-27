package Membro;

import java.util.*;
import Operacoes.Emprestimo;

public class Professor {
	//Atributos
		private String nome;
		private String departamento;
		private int sala;
		private String email;
		private String telefone;
		private int cadastroBiblioteca;
		private Set<Emprestimo> emprestimos;
		
		//Construtor
		public Professor(String nome, String departamento, int sala, String email, String telefone, int cadastroBiblioteca) {
			this.nome = nome;
			this.departamento = departamento;
			this.sala = sala;
			this.email = email;
			this.telefone = telefone;
			this.cadastroBiblioteca = cadastroBiblioteca;
		}
		
		//Getters e setters
		public String getnome() {
			return nome;
		}
		public void setnome(String nome) {
			this.nome = nome;
		}
		
		public int getsala() {
			return sala;
		}
		public void setsala(int sala) {
			this.sala = sala;
		}
		
		public String getdepartamento() {
			return departamento;
		}
		public void setendereco(String endereco) {
			this.departamento = endereco;
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
		
		public Set<Emprestimo> getemprestimos(Set<Emprestimo> emprestimos){
			return this.emprestimos;
		}
		public void setemprestimos(Set<Emprestimo> emprestimos) {
			this.emprestimos = emprestimos;
		}

}
