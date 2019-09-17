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
        this.categorias = new String[]{"Acao", "Aventura", "Suspense", "Terror", "Infantil", "Comedia"};
        this.subcategorias = new String[]{"Acao", "Aventura", "Suspense", "Terror", "Infantil", "Comedia"};
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

    public ArrayList<Conteudo> melhoresAvaliados(Double minimo) {
        ArrayList<Conteudo> vetorMelhoresAvaliados = new ArrayList<>();
        for (int i = 0; i < this.getFilmes().size(); i++) {
            if (this.getFilmes().get(i).getAvaliacao() != null && this.getFilmes().get(i).getAvaliacao() >= minimo) {
                vetorMelhoresAvaliados.add(this.getFilmes().get(i));
            }
        }
        for (int i = 0; i < this.getSeries().size(); i++) {
            if (this.getSeries().get(i).getAvaliacao() != null && this.getSeries().get(i).getAvaliacao() >= minimo) {
                vetorMelhoresAvaliados.add(this.getSeries().get(i));
            }
        }
        return this.ordenaMelhoresAvaliados(vetorMelhoresAvaliados);
    }

    private ArrayList<Conteudo> ordenaMelhoresAvaliados(ArrayList<Conteudo> vetorDeMelhoresAvaliados) {

        //Selection
        Conteudo menorAvaliacao;
        int posicaoDomenor;
        for (int i = 0; i < vetorDeMelhoresAvaliados.size(); i++) {
            menorAvaliacao = vetorDeMelhoresAvaliados.get(i);
            posicaoDomenor = i;
            for (int y = i + 1; y < vetorDeMelhoresAvaliados.size(); y++) {
                if (menorAvaliacao.getAvaliacao() > vetorDeMelhoresAvaliados.get(y).getAvaliacao()) {
                    menorAvaliacao = vetorDeMelhoresAvaliados.get(y);
                    posicaoDomenor = y;
                }
            }
            vetorDeMelhoresAvaliados.set(posicaoDomenor, vetorDeMelhoresAvaliados.get(i));
            vetorDeMelhoresAvaliados.set(i, menorAvaliacao);
        }
        return vetorDeMelhoresAvaliados;
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
