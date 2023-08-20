package Main;

import itens.Item;
import itens.Livro;
import itens.Revista;
import itens.CD;
import itens.DVD;
import MembroEfuncionario.Membro;
import MembroEfuncionario.funcionario;

public class Main {
	//instanciando objetos
	public static void main(String[] args) {
	Item itemsolicitado = new Item("Livro", "disponível");
	Livro livroSolicitado = new Livro("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx", "xxxxxx", "xxxxxx","xx/xx/xxxx");
	Revista revistaSolicitada = new Revista("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx",  "xxxxxx","xx/xx/xxxx");
	CD cdSolicitado = new CD("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx","xxxxxx", "xxxxxx","xx/xx/xxxx");
	DVD dvdSolicitado = new DVD("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx","xxxxxx", "xxxxxx","xx/xx/xxxx");
	Membro membro = new Membro("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, "xx/xx/xxxx", "válida");
	funcionario bibliotecarioResponsável = new funcionario("xxxxxx", "xxxxxx", "xx/xx/xxxx");
	
	String titulo = livroSolicitado.gettitulo();
	String isbn = livroSolicitado.getisbn();
	String codigoDeBarras = livroSolicitado.getcodigoDeBarras();
	String autor = livroSolicitado.getautor();
	String editora = livroSolicitado.geteditora();
	String dataLancamento = livroSolicitado.getdataLancamento();
	String itemSolicitado = itemsolicitado.getitemSolicitado();
	String disponibilidade = itemsolicitado.getdisponibilidade();
	int numeroDaConta = membro.getnumeroDaConta();
	String statusConta = membro.getstatusConta();
	String nome = bibliotecarioResponsável.getnome();
	
	System.out.println("O número da conta do membro é: " +numeroDaConta);
	System.out.println("O status da conta é: " +statusConta);
	System.out.println("O item selecionado é: " +itemSolicitado);
	System.out.println("Dados do item solicitado:"+"\r\n" + "	Título: "+titulo+ ", autor: " +autor+"\r\n"+" 	data de Lançamento: " +dataLancamento+ "\r\n"+ "	editora: "+editora+ "\r\n"+"	isbn: " +isbn+ "\r\n"+ "	código de barras: "+codigoDeBarras);
	System.out.println("Disponibilidade: " +disponibilidade);
	System.out.println("Funcionário que efetivou o empréstimo: " +nome);
	}
	
}
