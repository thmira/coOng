package main;

import java.util.Scanner;

import pessoa.Usuario;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Usuario usuario = new Usuario(); //Necess�rio para acessar os m�todos da classe Usu�rio

		while (true) {

			System.out.print("##-----------------------------CoOng-------------------------------##\n");
			System.out.print("|___________________________________________________________________|\n");
			System.out.print("|Selecione uma das op��es abaixo:                                   |\n");
			System.out.print("| 1 - Cadastro usuario                                              |\n");
			System.out.print("| 2 - Mostrar todos os usu�rios cadastrados                         |\n");
			System.out.print("| 3 - Sair                                                          |\n");
			System.out.print("|___________________________________________________________________|\n");
			
			System.out.print("Op��o: ");
			int opcao = scan.nextInt();

			if (opcao == 3) {
				System.out.println("Encerrando programa");
				scan.close();
				break;
			}

			switch (opcao) {
			case 1:
				usuario.adicionarUsuario();
				break;
			case 2:
				usuario.mostraUsuarios();
				break;
			default:
				System.out.println("Opc�o invalida!");
			}

		}

	}
}
