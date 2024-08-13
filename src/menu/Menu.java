package menu;

import java.util.Scanner;

import usuario.Cadastro;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	static Cadastro cadastro;
	
	public static void main(String[] args) {
		
		String escolha = null;

		while (escolha != "4") {
			System.out.println(" Menu inicial:(publico).\r\n"
					+ "1. Login: Fazer login no sistema.\r\n"
					+ "2. Listar Conteúdos: Listar os conteúdos.\r\n"
					+ "4. Sair: Sair do sistema.");
			escolha = sc.nextLine();
			
			switch(escolha) {
			
			case "1":
				System.out.println("Insira o usuário: ");
				String nome = sc.nextLine();
				System.out.println("Insira a senha: ");
				String senha = sc.nextLine();
				
				cadastro = new Cadastro(nome, senha);
				
				if(cadastro.getSenha() != null) {
					MenuAposLogin();
				}
			}
		}
		
		
	}

	private static void MenuAposLogin() {
		String escolhaAposLogin = null;
		while(escolhaAposLogin != "5") {
			System.out.println("Menu após login:\r\n"
					+ "1. Criar Conteúdo: Cria novo conteúdo.\r\n"
					+ "2. Listar Conteúdo: Listar os conteúdos.\r\n"
					+ "3. Atualizar Conteúdo: Editar conteúdo.\r\n"
					+ "4. Excluir Conteúdo: Deletar conteúdo.\r\n"
					+ "5. Logout: Sai do login.");
			escolhaAposLogin = sc.nextLine();
			switch(escolhaAposLogin) {
			
			case "1":
				cadastro.insert();
			case "2":
				cadastro.listar();
			}
		
		
			
		}
		
	}

}
