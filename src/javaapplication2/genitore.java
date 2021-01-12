/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amati.mattia
 */
public class genitore implements Runnable{
    abdul a;
    String nome;
    boolean b;
    
    public genitore(abdul a, String nome) {
        this.a = a;
        this.nome = nome;
    }
    
    @Override
    public void run(){
        while(!b){
            if(a.cucina(nome)){
                termina();
            }else{
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(genitore.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    

    
    public void termina(){
        b = true;
    }
}
