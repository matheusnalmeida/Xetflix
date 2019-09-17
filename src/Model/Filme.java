/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package Model;

import javax.swing.Icon;

public class Filme extends Conteudo {

    private int duracao;
    
    public Filme(String nome){
        super(nome);
    }
    
    public Filme(String nome, String categoria, String subcategoria, String descricao, String diretor,String[] listaDeAtores,Icon icone, int duracao) {
        super(nome, categoria, subcategoria, descricao, diretor,listaDeAtores,icone);
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        return duracao;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Filme filme = (Filme) obj;

        return (super.getNome().equals(filme.getNome()));
    }
}
