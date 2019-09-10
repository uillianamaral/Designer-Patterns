/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provabridge;

import relatorio.bridge.Pdf;
import relatorio.bridge.Relatorio;

/**
 *
 * @author Uillian
 */
public class ProvaBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Relatorio r = new Pdf();
        r.setModo(new Zip());        
        r.criar();
        
    }
    
}
