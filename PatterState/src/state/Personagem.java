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
public class Personagem {
    
    private Estado estado;
    private int life = 100;
    
    public Personagem(Estado estado){
        this.estado = estado;
    }
    
    public void atira(){
        estado.atirar();
    }
    
    public void move(){
        estado.mover();
    }
    
    public void caiNoBuraco(){
        this.estado = new Ferido();
    }
    
    public void sofrerDano(int dano){
        this.life -= dano;
        if(this.life < 20) {
            this.estado = new Ferido();
        }else {
            this.estado = new Normal();
        }
    }
    
    public void invencivel(){
        this.estado = new Invencivel();
        this.life += 80;
    }
    
}
