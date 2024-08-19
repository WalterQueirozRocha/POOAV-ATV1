package usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cadastro {
	Scanner sc = new Scanner(System.in);

	
	private String nome;
	private String senha;
	
	private List<String> conteudos = new ArrayList<>();
	
	public Cadastro(String nome, String senha) {
		this.nome = nome;
		if (nome.equals(senha)) {
			this.senha = senha;
			System.out.println("Bem vindo, " + nome + "!" );
		} else {
			System.out.println("Login ou senha invalidos!");
		}
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	public void insert() {
		System.out.print("Digite o conteudo: ");
		String conteudo = sc.nextLine();
		conteudos.add(conteudo);
	}
	
	public void listar() {
		int i = 1;
		for (String cont : conteudos) {
			System.out.println((i) + "-" + cont);
			i++;
		}
	}
	
	public void editar() {
		listar();
		System.out.print("Digite o numero do texto para edicao: ");
		int numeroEdicao = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o texto para edicao: ");
		String numeroTexto = sc.nextLine();
		
		conteudos.set(numeroEdicao - 1, numeroTexto);
	}

	public void deletar() {
		listar();
		System.out.print("Digite o numero do texto para deletar: ");
		int numeroDeletar = sc.nextInt();
		
		conteudos.remove(numeroDeletar - 1);
	}
}
