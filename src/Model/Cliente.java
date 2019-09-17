/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package Model;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String senha;

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
    public Conteudo melhoresAvaliados(Conteudo Conteudo, int minimo){
        if(Conteudo instanceof Filme){
            Netflix Netflix = new Netflix();
            
            for (int i = 0; i < Netflix.getFilmes().size(); i++) {
            if(Netflix.getFilmes().get(i).getAvaliacao() > minimo){
                return Netflix.getFilmes().get(i);
            }
            
            }
        }
    return null;
    }
    public void avaliarTitulo(Conteudo C, int avaliacao) {
        if (C instanceof Filme) {
            Netflix N = new Netflix();
            int indice = N.getFilmes().indexOf(C);
            N.getFilmes().get(indice).setAvaliacao(avaliacao);
        } else {
            Netflix N = new Netflix();
            int indice = N.getSeries().indexOf(C);
            N.getSeries().get(indice).setAvaliacao(avaliacao);
        }
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
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

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Cliente cliente = (Cliente) obj;

        return (this.cpf.equals(cliente.cpf) || this.email.equals(cliente.email));
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + '}';
    }

}
