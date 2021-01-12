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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // si sviluppi un applicativoove dichiarato un array di 20 instanze di thread che tentino di accedere simultaneamente ad una risorsa kebab condivisa il kebabbaro pup soddisfare una richista per volta visuallizare a chermo in che ordine vengono soddisfati i 20 clienti ogni 5 secodni
        abdul a = new abdul();
        Thread[] t = new Thread[20];
        genitore[] g = new genitore[20];
        for(int i = 0; i < g.length; i++){
            t[i] = new Thread( new genitore(a, "genitore " + i));
        }
        for(Thread gg : t){
            gg.start();
        }
    }
    
    
}
