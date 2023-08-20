package MembroEfuncionario;

public class Membro {
	//Atributos
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private int numeroDaConta;
	private String dataDeAberturaConta;
	private String statusConta;
	
	//Construtor
	public Membro(String nome, String endereco, String email, String telefone, int numeroDaConta, String dataDeAberturaConta, String statusConta) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.numeroDaConta = numeroDaConta;
		this.dataDeAberturaConta = dataDeAberturaConta;
		this.statusConta = statusConta;
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
	
	public int getnumeroDaConta() {
		return numeroDaConta;
	}
	public void setnumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getdataDeAberturaConta() {
		return dataDeAberturaConta;
	}
	public void setdataDeAberturaConta(String dataDeAberturaConta) {
		this.dataDeAberturaConta = dataDeAberturaConta;
	}
	
	public String getstatusConta() {
		return statusConta;
	}
	public void setstatusConta(String statusConta) {
		this.statusConta = statusConta;
	}

}
