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
			System.out.println("Bem vindo " + nome + "!" );
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
		System.out.println("Digite o conteudo: ");
		String conteudo = sc.nextLine();
		conteudos.add(conteudo);
	}
	
	public void listar() {
		for (String cont : conteudos) {
			System.out.println(cont);
		}
	}
	
	public void editar() {
		for(int i = 0; i < conteudos.size(); i++) {
			for (String cont : conteudos) {
				System.out.println((i + 1) + cont);
			}
		}
	}
	
}
