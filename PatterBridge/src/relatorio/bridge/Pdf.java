/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio.bridge;

/**
 *
 * @author Uillian
 */
public class Pdf extends Relatorio{
    
    @Override
    protected void exportar(){
        System.out.println("EXPORTANDO EM PDF");
    }
}
