package Membro;

import java.util.*;
import Operacoes.Emprestimo;

public class MembroExterno {
	//Atributos
		private String nome;
		private String cpf;
		private String endereco;
		private String email;
		private String telefone;
		private int cadastroBiblioteca;
		private Set<Emprestimo> emprestimos;
		
		//Construtor
		public MembroExterno(String nome, String cpf, String endereco, String email, String telefone, int cadastroBiblioteca) {
			this.nome = nome;
			this.cpf = cpf;
			this.endereco = endereco;
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
		
		public String getcpf() {
			return cpf;
		}
		public void setcpf(String cpf) {
			this.cpf = cpf;
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
		
		public Set<Emprestimo> getemprestimos(Set<Emprestimo> emprestimos){
			return this.emprestimos;
		}
		public void setemprestimos(Set<Emprestimo> emprestimos) {
			this.emprestimos = emprestimos;
		}

}
