package menu;

import java.util.Scanner;

import usuario.Cadastro;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	static Cadastro cadastro;
	
	public static void main(String[] args) {
		
		int escolha = 0;

		while (escolha != 4) {
			System.out.println("Menu inicial:(publico).\r\n"
					+ "1. Login: Fazer login no sistema.\r\n"
					+ "2. Listar Conteúdos: Listar os conteúdos.\r\n"
					+ "4. Sair: Sair do sistema.");
			System.out.print("Digite uma opcao: ");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch(escolha) {
			
			case 1:
				System.out.print("Insira o usuário: ");
				String nome = sc.nextLine();
				System.out.print("Insira a senha: ");
				String senha = sc.nextLine();
				
				cadastro = new Cadastro(nome, senha);
				
				if(cadastro.getSenha() != null) {
					MenuAposLogin();
				} 
				break;
			case 2: 
				if (cadastro != null) {
					cadastro.listar(); 
			    } else {
			    	System.out.println("Você precisa estar logado para listar conteúdos.");
			    }
				break;
			case 4:
	            System.out.println("Saindo do menu...");
	            break;
			default: 
	            System.out.println("Opção inválida. Tente novamente.");
	            break;
			}	
		}
	}

	private static void MenuAposLogin() {
		int escolhaAposLogin = 0;
		do {
			System.out.println("Menu após login:\r\n"
					+ "1. Criar Conteúdo: Cria novo conteúdo.\r\n"
					+ "2. Listar Conteúdo: Listar os conteúdos.\r\n"
					+ "3. Atualizar Conteúdo: Editar conteúdo.\r\n"
					+ "4. Excluir Conteúdo: Deletar conteúdo.\r\n"
					+ "5. Logout: Sai do login.");
			System.out.print("Digite uma opcao: ");
			escolhaAposLogin = sc.nextInt();
			sc.nextLine();
			
			switch(escolhaAposLogin) {
			
			case 1:
				cadastro.insert();
				break;
			case 2:
				cadastro.listar();
				break;
			case 3: 
				cadastro.editar();
				break;
			case 4: 
				cadastro.deletar();
				break;
			case 5:
	            System.out.println("Saindo do menu...");
	            break;
	        default: 
	            System.out.println("Opção inválida. Tente novamente.");
	            break;
	        }
		} while(escolhaAposLogin != 5);
	}
	
	
}
