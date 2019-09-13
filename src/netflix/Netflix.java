/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldo
 */
public class Netflix {

    private ArrayList<Filme> Filmes = new ArrayList<>();
    private ArrayList<Serie> Series = new ArrayList<>();
    private ArrayList<Cliente> Clientes = new ArrayList<>();

    public boolean cadastrarCliente(Cliente novoCliente) {
        if (!Clientes.contains(novoCliente)) {
            Clientes.add(novoCliente);
            return true;
        }
        return false;
    }

    public Cliente verificaLoginCliente(String emailInformado, String senhaInformada) {
        for (Cliente clienteAtual : this.Clientes) {
            if ((clienteAtual.getEmail().equals(emailInformado)) && (clienteAtual.getSenha().equals(senhaInformada))) {
                return clienteAtual;
            }
        }
        return null;
    }

    public void consultarConteudo(Conteudo C) {
        if (C instanceof Filme) {
            for (int i = 0; i < Filmes.size(); i++) {
                JOptionPane.showMessageDialog(null, "Filmes cadastrados--" + "\n" + Filmes);
            }

        } else {
            for (int i = 0; i < Series.size(); i++) {
                JOptionPane.showMessageDialog(null, "Series cadastrados--" + "\n" + Series);
            }
        }
    }

    public void cadastrarConteudo(Conteudo C) {
        if (C instanceof Filme) {
            this.Filmes.add((Filme) C);
        } else {
            this.Series.add((Serie) C);
        }
    }

    public void removerConteudo(Conteudo C) {
        if (C instanceof Filme) {
            for (int i = 0; i < Filmes.size(); i++) {
                if (C.equals(Filmes.get(i))) {
                    this.Filmes.remove(C);
                }
            }
        } else {
            for (int i = 0; i < Series.size(); i++) {
                if (C.equals(Series.get(i))) {
                    this.Series.remove(C);
                }
            }
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

    @Override
    public String toString() {
        return "Netflix{" + "Clientes=" + Clientes + '}';
    }

}
