/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

import java.util.ArrayList;

/**
 *
 * @author Aldo
 */
public class Netflix {
    private ArrayList<Filme> Filmes = new ArrayList<>();
    private ArrayList<Serie> Series = new ArrayList<>();
    private ArrayList<Cliente> Clientes = new ArrayList<>();
    public void cadastrarCliente(String nome,String cpf,String email, String senha){
        Cliente Cliente = new Cliente(nome, cpf, email, senha);
        Clientes.add(Cliente);
    }
    public void cadastrarConteudo(Conteudo C){
        if(C instanceof Filme){
            this.Filmes.add((Filme) C);
        }else{
            this.Series.add((Serie) C);
        }
    }
    public void removerConteudo(Conteudo C){
        if(C instanceof Filme){
            for (int i = 0; i < Filmes.size() ; i++) {
                if(C.equals(Filmes.get(i))){
                    this.Filmes.remove(C);
                }
            }
        }else{
            for (int i = 0; i < Series.size() ; i++) {
                if(C.equals(Series.get(i))){
                    this.Series.remove(C);
                }
            }
        }
    }
    public void alterarConteudo(){
        
    }

    public ArrayList<Filme> getFilmes() {
        return Filmes;
    }

    public void setFilmes(ArrayList<Filme> Filmes) {
        this.Filmes = Filmes;
    }

    public ArrayList<Serie> getSeries() {
        return Series;
    }

    public void setSeries(ArrayList<Serie> Series) {
        this.Series = Series;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }
    
    
}
