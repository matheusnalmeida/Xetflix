/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package Model;

public class Conteudo {

    private String nome;
    private String categoria;
    private String subcategoria;
    private String descricao;
    private int avaliacao;
    private String diretor;
    private String[] listaDeAtores;

    public Conteudo(String nome){
        this.nome = nome;
    }
    
    public Conteudo(String nome, String categoria, String subcategoria, String descricao, String diretor, String[] listaDeAtores) {
        this.nome = nome;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.descricao = descricao;
        this.diretor = diretor;
        this.listaDeAtores = listaDeAtores;
    }

    public void atualizarAvaliacao() {

    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Conteudo Conteudo = (Conteudo) obj;

        return (this.nome.equals(Conteudo.getNome()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
