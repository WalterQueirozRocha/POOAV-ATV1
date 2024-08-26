package menu;

import java.util.Scanner;

import conteudos.GerenciarConteudo;
import usuarios.Usuario;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	static Usuario usuario;
	static GerenciarConteudo gerenciarConteudo = new GerenciarConteudo();
	
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
				
				usuario = new Usuario(nome, senha);
				
				if(usuario.getSenha() != null) {
					MenuAposLogin();
				} 
				break;
			case 2: 
				gerenciarConteudo.listarMensagens();
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
				System.out.print("Digite o titulo do conteudo: ");
				String titulo = sc.nextLine();
				System.out.print("Digite o conteudo: ");
				String mensagem = sc.nextLine();
				gerenciarConteudo.adicionarMensagem(titulo, mensagem, usuario);
				break;
			case 2:
				gerenciarConteudo.listarMensagens();
				break;
			case 3:
				gerenciarConteudo.listarMensagens();
				System.out.print("Digite o ID da mensagem para editar: ");
		        int idMensagem = sc.nextInt();
		        sc.nextLine();
				System.out.print("Escolha qual atributo editar (titulo, conteudo): ");
				String atributoEditar = sc.nextLine();
				System.out.print("Escolha o novo texto: ");
				String novoTexto = sc.nextLine();
				gerenciarConteudo.editar(idMensagem, atributoEditar, novoTexto);
				break;
			case 4:
				System.out.print("Digite o ID da mensagem para excluir: ");
		        int idExclusao = sc.nextInt();
				gerenciarConteudo.excluir(idExclusao);
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
