/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Aldo
 */
public class Netflix {

    private ArrayList<Filme> Filmes;
    private ArrayList<Serie> Series;
    private ArrayList<Cliente> Clientes;
    private String[] categorias;
    private String[] subcategorias;

    public Netflix() {
        this.Filmes = new ArrayList<>();
        this.Series = new ArrayList<>();
        this.Clientes = new ArrayList<>();
        this.categorias = new String[]{"Acao","Aventura","Suspense","Terror","Infantil","Comedia"};
        this.subcategorias = new String[]{"Acao","Aventura","Suspense","Terror","Infantil","Comedia"};
    }    
    
    public boolean cadastrarCliente(Cliente novoCliente) {
        if (!Clientes.contains(novoCliente)) {
            Clientes.add(novoCliente);
            return true;
        }
        return false;
    }

    public boolean cadastrarFilme(Filme novoFilme) {
        if (!Filmes.contains(novoFilme)) {
            Filmes.add(novoFilme);
            return true;
        }
        return false;
    }
    
    public boolean cadastrarSerie(Serie novaSerie) {
        if (!Series.contains(novaSerie)) {
            Series.add(novaSerie);
            return true;
        }
        return false;
    }
    
    public Filme buscarFilme(String nome){
        for (Filme filmeAtual : this.Filmes) {
            if (filmeAtual.equals(new Filme(nome))){
                return filmeAtual;
            }
        }
        return null;
    }
    
    public Serie buscarSerie(String nome){
        for (Serie serieAtual : this.Series) {
            if (serieAtual.equals(new Serie(nome))){
                return serieAtual;
            }
        }
        return null;
    }
    
    public Cliente verificaLoginCliente(String emailInformado, String senhaInformada) {
        for (Cliente clienteAtual : this.Clientes) {
            if ((clienteAtual.getEmail().equals(emailInformado)) && (clienteAtual.getSenha().equals(senhaInformada))) {
                return clienteAtual;
            }
        }
        return null;
    }
    
    public void cadastrarConteudo(Conteudo C) {
        if (C instanceof Filme) {
            this.Filmes.add((Filme) C);
        } else {
            this.Series.add((Serie) C);
        }
    }

    public void alterarConteudo() {

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

    public String[] getCategorias() {
        return categorias;
    }

    public String[] getSubcategorias() {
        return subcategorias;
    }
    

    @Override
    public String toString() {
        return "Netflix{" + "Clientes=" + Clientes + '}';
    }

}
