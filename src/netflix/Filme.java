/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package netflix;

public class Filme extends Conteudo{
        private String duracao;

   
    
        
        
        
        
    public Filme(String duracao) {
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
        
        
}
