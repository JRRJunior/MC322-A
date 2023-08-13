package Main;

import Livro.Livro;
import UsuarioEfuncionario.Usuario;
import UsuarioEfuncionario.funcionario;

public class Main {
	//instanciando objetos
	public static void main(String[] args) {
	Livro livroSolicitado = new Livro("xxx-xx-xxxxx-xx-x", "xxxxxx", "xxxxxx",1990);
	Usuario membro = new Usuario("xxxxx", "xxxxxx", 11111, 2015, "válida");
	funcionario bibliotecarioResponsável = new funcionario("xxxxxx", "xxxxxx");
	
	String titulo = livroSolicitado.gettitulo();
	int numeroDaConta = membro.getnumeroDaConta();
	String statusConta = membro.getstatusConta();
	String nome = bibliotecarioResponsável.getnome();
	
	System.out.println("O livro selecionado é: " +titulo);
	System.out.println("O número da conta do membro é: " +numeroDaConta);
	System.out.println("O status da conta é: " +statusConta);
	System.out.println("O bibliotecário responsável pela autorização do empréstimo é: " +nome);
	}
	
}
