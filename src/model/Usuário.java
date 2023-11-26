package model;

public class Usuário {
	
	//Atributos
	
		private String nome;
		private String rg;
		private String cpf;
		private String dataNascimento;
		private String endereco;
		private String email;
		private String telefone;
		
	//Construtor
		
		public Usuário(String nome, String rg, String cpf, String dataNascimento, String endereco, String email, String telefone) {
			
			this.nome = nome;
			this.rg = rg;
			this.cpf = cpf;
			this.dataNascimento = dataNascimento;
			this.endereco = endereco;
			this.email = email;
			this.telefone = telefone;
		}
		
	//Getters e setters
		
		public String getnome() {
			return nome;
		}
		public void setnome(String nome) {
			this.nome = nome;
		}
		
		public String getrg() {
			return rg;
		}
		public void setrg(String rg) {
			this.rg = rg;
		}
		
		public String getcpf() {
			return cpf;
		}
		public void setcpf(String cpf) {
			this.cpf = cpf;
		}
		
		public String getdataNascimento() {
			return dataNascimento;
		}
		public void setdataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
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

}
