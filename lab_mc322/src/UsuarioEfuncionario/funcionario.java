package UsuarioEfuncionario;

public class funcionario {
	//Atributos
	private String nome;
	private String endereco;
	
	//Construtor
	public funcionario(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
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

}
