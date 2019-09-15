/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package Model;

public class Serie extends Conteudo {

    private int temporadas;

    public Serie(String nome){
        super(nome);
    }
    
    public Serie(String nome, String categoria, String subcategoria, String descricao, String diretor, String[] listaDeAtores, int temporadas) {
        super(nome, categoria, subcategoria, descricao, diretor, listaDeAtores);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Serie serie = (Serie) obj;

        return (super.getNome().equals(serie.getNome()));
    }
}
