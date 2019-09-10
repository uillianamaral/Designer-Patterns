/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provatemplete;

import templete.Email;
import templete.FolhaDePag;


/**
 *
 * @author Uillian
 */
public class ProvaTemplete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FolhaDePag folhaDePagamento =  new Email();
        folhaDePagamento.processaDados();
        
    }
    
}
