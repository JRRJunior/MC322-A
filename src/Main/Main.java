package Main;

import java.util.*;
import itens.*;
import Membro.*;
import Operacoes.*;

public class Main {
	//instanciando objetos
	public static void main(String[] args) {
	LivroFisico livroFisicoSolicitado = new LivroFisico(0, 0, null, null, null, null, 0, null, null, null);
	LivroDigital livroDigitalSolicitado = new LivroDigital(null, null, null, null, null, null, null, 0, null, null, null);
	Outros outraMidiaSolicitada = new Outros(null, null, null,  null, null, null, 0, null, null, null);
	CD cdSolicitado = new CD(null, null, null, null, null, null, 0, null, null, null);
	DVD dvdSolicitado = new DVD(null, null, null, null, null, null, 0, null, null, null);
	EstudanteGrad estudanteGrad= new EstudanteGrad("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, "xx/xx/xxxx", 111111);
	EstudantePosGrad estudantePosGrad= new EstudantePosGrad("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, "xx/xx/xxxx", 111111);
	MembroExterno membroExterno = new MembroExterno("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, "xx/xx/xxxx", 111111);
	Funcionario funcionario = new Funcionario("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, "xx/xx/xxxx", 111111);
	Professor professor = new Professor("xxxxx", "xxxxxx", "xxxxx@xxxx.com", "(xxx)xxxx-xxxx", 11111, "xx/xx/xxxx", 111111);
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
