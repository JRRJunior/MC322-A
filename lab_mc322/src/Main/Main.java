package Main;

import itens.*;
import MembroEfuncionario.*;

public class Main {
	//instanciando objetos
	public static void main(String[] args) {
	Item itemsolicitado = new Item("Livro", "disponível");
	LivroFisico livroFisicoSolicitado = new LivroFisico("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx", "xxxxxx", "xxxxxx","xx/xx/xxxx");
	LivroDigital livroDigitalSolicitado = new LivroDigital("xxx-xx-xxxxx-xx-x", "xxxxxx", "xxxxxx", "xxxxxx","xx/xx/xxxx");
	Revista revistaSolicitada = new Revista("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx",  "xxxxxx","xx/xx/xxxx");
	CD cdSolicitado = new CD("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx","xxxxxx", "xxxxxx","xx/xx/xxxx");
	DVD dvdSolicitado = new DVD("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx","xxxxxx", "xxxxxx","xx/xx/xxxx");
	Membro membro = new Membro("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, "xx/xx/xxxx", "válida");
	funcionario bibliotecarioResponsável = new funcionario("xxxxxx", "xxxxxx", "xx/xx/xxxx");
	
	String titulo = livroFisicoSolicitado.gettitulo();
	String isbn = livroFisicoSolicitado.getisbn();
	String codigoDeBarras = livroFisicoSolicitado.getcodigoDeBarras();
	String autor = livroFisicoSolicitado.getautor();
	String editora = livroFisicoSolicitado.geteditora();
	String dataLancamento = livroFisicoSolicitado.getdataLancamento();
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
