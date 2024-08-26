package conteudos;

import usuarios.Usuario;

public class Conteudo {

	private int id;
	private String titulo;
	private String mensagem;
	private Usuario usuario;
	
	public Conteudo() {
	}
	
	public Conteudo(int id, String titulo, String mensagem, Usuario usuario) {
		this.id = id;
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	@Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Mensagem: " + mensagem + ", Autor: " + usuario;
    }
}
