/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Uillian
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personagem p = new Personagem(new Normal());
        p.atira();
        p.caiNoBuraco();
        p.atira();
        
        p.sofrerDano(30);
        p.atira();
        p.sofrerDano(40);
        p.atira();
        p.sofrerDano(20);
        p.atira();
        
        p.invencivel();
        p.atira();
        p.move();
        
        p.sofrerDano(2);
        p.atira();
        
    }
    
}
