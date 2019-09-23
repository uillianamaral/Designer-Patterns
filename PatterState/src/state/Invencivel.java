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
public class Invencivel implements Estado{
    
    @Override
    public void mover(){
        System.out.println("Movendo rapido");
    }
    
    @Override
    public void atirar(){
        System.out.println("Atirando Rapido");
    }
    
}
