/**
 *
 * @author Aldo Wanderley Costa Junior
 */
package Model;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private ArrayList<Conteudo> conteudosAvaliados;

    public Cliente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Cliente(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.conteudosAvaliados = new ArrayList<>();
    }

    public void avaliarTitulo(Conteudo C, Double avaliacao) {
        C.setAvaliacao(avaliacao);
        this.conteudosAvaliados.add(C);
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

    public ArrayList<Conteudo> getConteudosAvaliados() {
        return conteudosAvaliados;
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
