/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package netflix;

public class Cliente {
           private String nome;
           private String cpf;
           private String email;
           private String senha;

    public Cliente() {
    }

    public Cliente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public Cliente(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    
    public void avaliarTitulo(Conteudo C, int avaliacao){
    if(C instanceof Filme){
        Netflix N = new Netflix();
        int indice = N.getFilmes().indexOf(C);
        N.getFilmes().get(indice).setAvaliacao(avaliacao);
    }else {
        Netflix N = new Netflix();
        int indice = N.getSeries().indexOf(C);
        N.getSeries().get(indice).setAvaliacao(avaliacao);
    }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
           
    
    public boolean equals(Object obj) 
    { 
          
    
    if(this == obj) {
            return true; 
    }
       
        if(obj == null || obj.getClass()!= this.getClass()) {
            return false; 
        }
       
        Cliente Cliente = (Cliente) obj; 
        
        return (this.email.equals(Cliente.email) && this.senha.equals(Cliente.senha)); 
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + '}';
    }
    
    
}
