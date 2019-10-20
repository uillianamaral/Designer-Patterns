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
public class Barometro extends Observado{
    
    private double precao;

    public double getPrecao() {
        return precao;
    }

    public void setPrecao(double precao) {
        this.precao = precao;
        notificaTodos();
    }
}
