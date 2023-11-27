package main;

import java.util.*;

import controller.*;
import model.*;
import view.*;

public class Main {
	
	private static PacotesController pacotesController;
	
	public static void main(String[] args) {
		PacotesController = new PacotesControllerImpl();
        PacotesView pacotesView = new PacotesViewImpl(PacotesController);
	
	Scanner scanner = new Scanner(System.in);{
    
    while (true) {
        System.out.println(" Menu do usuário ");
        System.out.println();
        System.out.println("1. Descrição de pacotes");
        System.out.println("2. Reserva de pacotes");
        System.out.println("3. Sair");
        System.out.println();
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                // Menu descrição de pacotes
                menuDescricaoPacotes(scanner, pacotesView);
                break;
            case 2:
                // Menu Reserva de pacotes
                menuReservaPacotes(scanner, pacotesView);
                break;
            case 3:
                System.out.println("Fim da sessão");
                scanner.close();
                return;
            default:
                System.out.println("Opção inválida. Por favor, escolha novamente.");
        }
    }
}
	private static void menuDescricaoPacotes(Scanner scanner, PacotesView pacotesView) {
        while (true) {
            System.out.println(" Tipos de pacotes ");
            System.out.println();
            System.out.println("1. Aventura");
            System.out.println("2. Cultura");
            System.out.println("3. Relaxamento");
            System.out.println("4. Voltar");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcaoItens = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoItens) {
                case 1:
                	System.out.print("O pacote de aventura oferece ao cliente a oportunidade de participar em atividades ao ar livre, tais como trilhas e montanhismo.");
                    break;
                case 2:
                	System.out.print("O pacote cultural oferece ao cliente a oportunidade de participar em atividades culturais, tais como shows musicais e ida a museus.");
                    break;
                case 3:
                	System.out.print("O pacote de relaxamento oferece ao cliente a possibilidade de estadia em hotel fazenda e ida a spas.");                    
                	break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
	
	private static void menuReservaPacotes(Scanner scanner, PacotesView pacotesView) {
        while (true) {
            System.out.println(" Pacotes para reserva ");
            System.out.println();
            System.out.println("1. Aventura");
            System.out.println("2. Cultura");
            System.out.println("3. Relaxamento");
            System.out.println("4. Voltar");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcaoItens = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoItens) {
                case 1:
                	System.out.print("O pacote de aventura oferece ao cliente a oportunidade de participar em atividades ao ar livre, tais como trilhas e montanhismo.");
                    break;
                case 2:
                	System.out.print("O pacote cultural oferece ao cliente a oportunidade de participar em atividades culturais, tais como shows musicais e ida a museus.");
                    break;
                case 3:
                	System.out.print("O pacote de relaxamento oferece ao cliente a possibilidade de estadia em hotel fazenda e ida a spas.");                    
                	break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

}	 
