package Membro;

public class Funcionario {
	//Atributos
	private String nome;
	private String cpf;
	private String dataDeAdmissao;
	private String cargo;
	private String endereco;
	private String email;
	private String telefone;
	
	//Construtor
	public Funcionario(String nome, String cpf, String dataDeAdmissao, String cargo, String endereco, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeAdmissao = dataDeAdmissao;
		this.cargo = cargo;
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
	
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getdataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setdataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	public String getcargo() {
		return cargo;
	}
	public void setcargo(String cargo) {
		this.cargo = cargo;
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
