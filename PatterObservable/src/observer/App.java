/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Uillian
 */
public class App implements Observador{
    
    @Override
    public void notifica() {
        System.out.println("sou um APP e algo mudou");
    }
}
