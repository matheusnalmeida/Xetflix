/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Aldo
 */
public class Netflix {

    private ArrayList<Filme> Filmes;
    private ArrayList<Serie> Series;
    private ArrayList<Conteudo> Conteudo;
    private ArrayList<Cliente> Clientes;
    private String[] categorias;
    private String[] subcategorias;
    private HashMap<Integer,LinkedList<Conteudo>> hashMapDeAvaliados;
    
    public Netflix() {
        this.Filmes = new ArrayList<>();
        this.Series = new ArrayList<>();
        this.Conteudo = new ArrayList<>();
        this.Clientes = new ArrayList<>();
        this.categorias = new String[]{"Acao", "Aventura", "Suspense", "Terror", "Infantil", "Comedia"};
        this.subcategorias = new String[]{"Acao", "Aventura", "Suspense", "Terror", "Infantil", "Comedia"};
        this.preencheHashMap();
    }
    
    public void adicionaNovoConteudoAvaliado(Integer key, Conteudo novoContedudo){
        this.hashMapDeAvaliados.get(key).add(novoContedudo);
    }
    
    public void mudaAvaliacaoConteudo(Integer keyAntiga,Integer keyNova,Conteudo conteudo){
        this.hashMapDeAvaliados.get(keyAntiga).remove(conteudo);
        this.hashMapDeAvaliados.get(keyNova).add(conteudo);
    }

    public ArrayList<Conteudo> avaliadosRecentemente() {
        ArrayList<Conteudo> vetorDeAdicionadosRecentemente = new ArrayList<>();
        int maiorTamanho = this.Filmes.size();

        //Pegando o vetor com maior tamanho
        if (maiorTamanho < this.Series.size()) {
            maiorTamanho = this.Series.size();
        }
        for (int i = maiorTamanho - 1; i >= 0; i--) {
            if (i < this.Series.size()) {
                vetorDeAdicionadosRecentemente.add(this.getSeries().get(i));
            }
            if (i < this.Filmes.size()) {
                vetorDeAdicionadosRecentemente.add(this.getFilmes().get(i));
            }
        }
        return vetorDeAdicionadosRecentemente;
    }
    public ArrayList<Conteudo> retornoDiretor(String nomePessoa){
        ArrayList<Conteudo> vetorDiretorTrabalhos = new ArrayList<>();
        for (int i = 0; i < Filmes.size(); i++) {
            if(Filmes.get(i).getDiretor().equals(nomePessoa)){
                vetorDiretorTrabalhos.add(Filmes.get(i));
            }
        }
        for (int i = 0; i < Series.size(); i++) {
             if(Series.get(i).getDiretor().equals(nomePessoa)){
                vetorDiretorTrabalhos.add(Series.get(i));
            }
        }
    return vetorDiretorTrabalhos;
    }
    
    public ArrayList<Conteudo> retornoAtores( String nomepessoa){
        ArrayList<Conteudo> vetorAtoresTrabalhos = new ArrayList<>();
        for (int i = 0; i < Filmes.size(); i++) {
            if(Filmes.get(i).getListaDeAtores()[i].equals(nomepessoa)){
                vetorAtoresTrabalhos.add(Filmes.get(i));
            }
        }
        for (int i = 0; i < Series.size(); i++) {
               if(Series.get(i).getListaDeAtores()[i].equals(nomepessoa)){
                vetorAtoresTrabalhos.add(Series.get(i));
            }
        }
        return vetorAtoresTrabalhos;
    }
    
    public ArrayList<Conteudo> retornoCategoria(String categoria){
        ArrayList<Conteudo> vetorRecente = new ArrayList<>();
        for (int i = 0; i < Filmes.size(); i++) {
            if(Filmes.get(i).getCategoria().equals(categoria)){
                vetorRecente.add(Filmes.get(i));
            }
        }
        for (int i = 0; i < Series.size(); i++) {
            if(Series.get(i).getCategoria().equals(categoria)){
                vetorRecente.add(Series.get(i));
            }
        }
        return vetorRecente;
    }
    
    public LinkedList<Conteudo> melhoresAvaliados(Integer minimo){
        LinkedList<Conteudo> listaDeConteudosMelhoresAvaliados = new LinkedList<>();
        for (int i = minimo; i <= 5; i++) {
            LinkedList<Conteudo> linkedListAtual = this.hashMapDeAvaliados.get(i);
            for (Conteudo conteudo : linkedListAtual) {
                listaDeConteudosMelhoresAvaliados.add(conteudo);
            }
        }
        return listaDeConteudosMelhoresAvaliados;
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
            Conteudo.add(novoFilme);
            return true;
        }
        return false;
    }

    public boolean cadastrarSerie(Serie novaSerie) {
        if (!Series.contains(novaSerie)) {
            Series.add(novaSerie);
            Conteudo.add(novaSerie);
            return true;
        }
        return false;
    }

    public Filme buscarFilme(String nome) {
        for (Filme filmeAtual : this.Filmes) {
            if (filmeAtual.equals(new Filme(nome))) {
                return filmeAtual;
            }
        }
        return null;
    }

    public Serie buscarSerie(String nome) {
        for (Serie serieAtual : this.Series) {
            if (serieAtual.equals(new Serie(nome))) {
                return serieAtual;
            }
        }
        return null;
    }
    
    public Conteudo buscarConteudo(String nome){
        for (Conteudo conteudo : this.Conteudo) {
            if (nome.equals(conteudo.getNome())) {
                return conteudo;
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

    private void preencheHashMap(){
        this.hashMapDeAvaliados = new HashMap<>();
        this.hashMapDeAvaliados.put(1, new LinkedList<>());
        this.hashMapDeAvaliados.put(2, new LinkedList<>());
        this.hashMapDeAvaliados.put(3, new LinkedList<>());
        this.hashMapDeAvaliados.put(4, new LinkedList<>());
        this.hashMapDeAvaliados.put(5, new LinkedList<>());
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

    public ArrayList<Conteudo> getConteudo() {
        return Conteudo;
    }
 
    @Override
    public String toString() {
        return "Netflix{" + "Clientes=" + Clientes + '}';
    }

}
