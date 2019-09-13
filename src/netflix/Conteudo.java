/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package netflix;

public class Conteudo {
private String nome;
        private String categoria;
        private String subcategoria;
        private String descricao;
        private int avaliacao;
        private String diretor;
        private String atores;

    public Conteudo() {
    }

    public Conteudo(String nome, String categoria, String subcategoria, String descricao, int avaliacao, String diretor, String atores) {
        this.nome = nome;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
        this.atores = atores;
    }
    
    public void atualizarAvaliacao(){
        
    }  
   public boolean equals(Object obj) 
    { 
          
    
    if(this == obj) {
            return true; 
    }
       
        if(obj == null || obj.getClass()!= this.getClass()) {
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

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }
        
}
