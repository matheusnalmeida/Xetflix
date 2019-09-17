/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author Matheus Nunes
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Netflix a = new Netflix();
        
        Filme b =  new Filme("A");
        b.setAvaliacao(2.0);
        
        Filme c =  new Filme("B");
        c.setAvaliacao(1.0);
        
        Filme d =  new Filme("C");
        d.setAvaliacao(3.0);
        
        Filme e =  new Filme("D");
        e.setAvaliacao(4.0);
        
        Serie asd = new Serie("asd");
        asd.setAvaliacao(3.5);
        
        Filme f =  new Filme("E");
        f.setAvaliacao(5.0);
        f.setAvaliacao(2.0);
        
        a.cadastrarFilme(b);
        a.cadastrarFilme(c);
        a.cadastrarFilme(d);
        a.cadastrarFilme(e);
        a.cadastrarFilme(f);
        a.cadastrarSerie(asd);
        
        System.out.println(a.getSeries());
        System.out.println((a.melhoresAvaliados(0.0)));
    }
    
}
