package UsuarioEfuncionario;

public class Usuario {
	//Atributos
	private String nome;
	private String endereco;
	private int numeroDaConta;
	private int dataDeAberturaConta;
	private String statusConta;
	
	//Construtor
	public Usuario(String nome, String endereco, int numeroDaConta, int dataDeAberturaConta, String statusConta) {
		this.nome = nome;
		this.endereco = endereco;
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
	
	public int getnumeroDaConta() {
		return numeroDaConta;
	}
	public void setnumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public int getdataDeAberturaConta() {
		return dataDeAberturaConta;
	}
	public void setdataDeAberturaConta(int dataDeAberturaConta) {
		this.dataDeAberturaConta = dataDeAberturaConta;
	}
	
	public String getstatusConta() {
		return statusConta;
	}
	public void setstatusConta(String statusConta) {
		this.statusConta = statusConta;
	}

}
