package Main;

import java.util.*;
import itens.*;
import Membro.*;
import Operacoes.*;

public class Main {
	//instanciando objetos
	public static void main(String[] args) {
	Item itemsolicitado = new Item("Livro", "disponível");
	LivroFisico livroFisicoSolicitado = new LivroFisico("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx", "xxxxxx", "xxxxxx","xx/xx/xxxx");
	LivroDigital livroDigitalSolicitado = new LivroDigital("xxx-xx-xxxxx-xx-x", "xxxxxx", "xxxxxx", "xxxxxx","xx/xx/xxxx");
	Revista revistaSolicitada = new Revista("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx",  "xxxxxx","xx/xx/xxxx");
	CD cdSolicitado = new CD("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx","xxxxxx", "xxxxxx","xx/xx/xxxx");
	DVD dvdSolicitado = new DVD("xxx-xx-xxxxx-xx-x", "xxx-xx-xxxxx-xx-x", "xxxxxx","xxxxxx", "xxxxxx","xx/xx/xxxx");
	EstudanteGrad estudanteGrad= new EstudanteGrad("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, 111111);
	EstudantePosGrad estudantePosGrad= new EstudantePosGrad("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, 111111);
	MembroExterno membroExterno = new MembroExterno("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", "xxxxxx", 111111);
	Funcionario funcionario = new Funcionario("xxxxxx", "xxxxxx", "xx/xx/xxxx", "xxxxxx","xxxxxx","xxxxxx", "xxxxxx");
	Emprestimo emprestimo1 = new Emprestimo("xxxxx", "xxxxxx", "xx/xx/xxxx", "xx/xx/xxxx");
	Emprestimo emprestimo2 = new Emprestimo("yyyyy", "yyyyyy", "yy/yy/yyyy", "yy/yy/yyyy");
	
	//associação entre uma das classe de membro e da classe emprestimos
	Set<Emprestimo> emprestimos = new HashSet<>();
	emprestimos.add(emprestimo1);
	emprestimos.add(emprestimo2);
	
	estudanteGrad.setemprestimos(emprestimos);
	
	System.out.println("O estudante de graduação " +estudanteGrad.getnome()+ " está com os itens " + emprestimo1.getitemEmprestado() + " e " +emprestimo2.getitemEmprestado());
	}
	
}
