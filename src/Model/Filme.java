/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package Model;

public class Filme extends Conteudo {

    private int duracao;
    
    public Filme(String nome, String categoria, String subcategoria, String descricao, String diretor,String[] listaDeAtores, int duracao) {
        super(nome, categoria, subcategoria, descricao, diretor,listaDeAtores);
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
