/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package Model;

import javax.swing.Icon;

public class Conteudo {

    private String nome;
    private String categoria;
    private String subcategoria;
    private String descricao;
    private Double avaliacao;
    private String diretor;
    private String[] listaDeAtores;
    private Icon icone;

    public Conteudo(String nome) {
        this.nome = nome;
    }

    public Conteudo(String nome, String categoria, String subcategoria, String descricao, String diretor, String[] listaDeAtores, Icon icone) {
        this.nome = nome;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.descricao = descricao;
        this.diretor = diretor;
        this.listaDeAtores = listaDeAtores;
        this.icone = icone;
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

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        if (this.avaliacao != null) {
            this.avaliacao = (this.avaliacao + avaliacao) / 2;
        } else {
            this.avaliacao = avaliacao;
        }
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String[] getListaDeAtores() {
        return listaDeAtores;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
