package MembroEfuncionario;

public class funcionario {
	//Atributos
	private String nome;
	private String cpf;
	private String dataDeAdmissao;
	
	//Construtor
	public funcionario(String nome, String cpf, String dataDeAdmissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeAdmissao = dataDeAdmissao;
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
	public void setendereco(String endereco) {
		this.cpf = endereco;
	}
	
	public String getdataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setdataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

}
