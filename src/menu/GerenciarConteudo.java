package menu;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConteudo {
	
	private List<Conteudo> conteudos = new ArrayList<>();
	private int id = 1;
	
	public void adicionarMensagem(String titulo, String mensagem, Usuario usuario) {
        Conteudo conteudo = new Conteudo(id++, titulo, mensagem, usuario);
		conteudos.add(conteudo);
	}
	
	public void listarMensagens() {
		if (conteudos.isEmpty()) {
            System.out.println("Nenhuma mensagem para exibir.");
        } else {
            for (Conteudo conteudo : conteudos) {
                System.out.println(conteudo);
            }
        }
	}

	public void editar(int idMensagem, String atributoParaEditar, String novoTexto) {
		Conteudo mensagemParaEditar = null;
		
		for (Conteudo conteudo : conteudos) {
            if (conteudo.getId() == idMensagem) {
                mensagemParaEditar = conteudo;
                break;
            }
        }
        
        if (mensagemParaEditar == null) {
            System.out.println("Mensagem com ID " + idMensagem + " não encontrada.");
            return;
        }
        
        if (atributoParaEditar.equalsIgnoreCase("titulo")) {
            mensagemParaEditar.setTitulo(novoTexto);
            System.out.println("Atualizado com sucesso!");
        } else if (atributoParaEditar.equalsIgnoreCase("conteudo")) {
            mensagemParaEditar.setMensagem(novoTexto);
            System.out.println("Atualizado com sucesso!");
        } else {
            System.out.println("Opção indisponível!");
        }
	}
	
	public void excluir(int idExclusao) {
		boolean possivelExclusao = false;
        int indexParaExcluir = -1;

        for (int i = 0; i < conteudos.size(); i++) {
            Conteudo conteudo = conteudos.get(i);
            if (conteudo.getId() == idExclusao) {
                possivelExclusao = true;
                indexParaExcluir = i;
                break;
            }
        }
		
		if (possivelExclusao) {
            conteudos.remove(indexParaExcluir);
            System.out.println("Mensagem com ID " + idExclusao + " excluída com sucesso.");
        } else {
            System.out.println("Mensagem com ID " + idExclusao + " não encontrada.");
        }
    }
}
