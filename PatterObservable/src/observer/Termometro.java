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
public class Termometro extends Observado{
    
    private Double temperatura;
    
    public Double getTemperatura(){
        return temperatura;
    }
    public void setTemperatura(Double temperatura){
        this.temperatura = temperatura;
        notificaTodos();
    }

  
}
