package biblioteca.models.membros;

import java.util.*;
import biblioteca.models.Operacoes.Emprestimo;

public class EstudanteGrad extends Pessoas {
	//Atributos
	private Set<Emprestimo> emprestimos;
	
	//Construtor
	public EstudanteGrad(String nome, String endereco, String email, String telefone, int cadastroBiblioteca, String dataRegistro, int nmrIDuniversidade) {
		super (nome, endereco, email, telefone, cadastroBiblioteca, dataRegistro, nmrIDuniversidade);
	}	
	
	public Set<Emprestimo> getemprestimos(Set<Emprestimo> emprestimos){
		return this.emprestimos;
	}
	public void setemprestimos(Set<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
