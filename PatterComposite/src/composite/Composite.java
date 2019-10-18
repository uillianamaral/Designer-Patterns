/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Uillian
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IProduto shampoo = new ProdutoSimples("Shampoo", 9.4);
        IProduto condicionador = new ProdutoSimples("Condicionador", 8.6);
        
        IProduto kit = new ProdutoComposto(shampoo, condicionador);
        
        IProduto cesta = new ProdutoComposto(kit, shampoo);
        
        NotaFiscal nf = new NotaFiscal();
        
        nf.addProduto(cesta);
        nf.imprimeNota();
        
    }
    
}
