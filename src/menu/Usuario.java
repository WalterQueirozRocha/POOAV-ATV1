package menu;

import java.util.Scanner;


public class Usuario {
	Scanner sc = new Scanner(System.in);

	
	private String nome;
	private String senha;
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	 @Override
	    public String toString() {
	        return nome;
	    }
}
