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
public class abdul {

    public abdul() {
    }
    
    synchronized public boolean cucina(String cliente){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) { 
            Logger.getLogger(abdul.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        System.out.println("preparo per "+ cliente);
        return true;
    }
}
