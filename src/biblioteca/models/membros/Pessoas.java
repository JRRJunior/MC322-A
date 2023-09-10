package biblioteca.models.membros;

import java.util.Set;

import biblioteca.models.Operacoes.Emprestimo;

public class Pessoas {
	//Atributos
		private String nome;
		private String endereco;
		private String email;
		private String telefone;
		private int cadastroBiblioteca;
		private String dataRegistro;
		private int nmrIDuniversidade;
		
		//Construtor
		public Pessoas(String nome, String endereco, String email, String telefone, int cadastroBiblioteca, String dataRegistro, int nmrIDuniversidade) {
			this.nome = nome;
			this.endereco = endereco;
			this.email = email;
			this.telefone = telefone;
			this.cadastroBiblioteca = cadastroBiblioteca;
			this.dataRegistro = dataRegistro;
			this.nmrIDuniversidade = nmrIDuniversidade;
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
		
		public String getdataRegistro() {
			return dataRegistro;
		}
		public void setdataRegistro(String dataRegistro) {
			this.dataRegistro = dataRegistro;
		}
		
		public int getnmrIDuniversidade() {
			return nmrIDuniversidade;
		}
		public void setnmrIDuniversidade(int nmrIDuniversidade) {
			this.nmrIDuniversidade = nmrIDuniversidade;
		}
}
