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
public class ProdutoComposto implements IProduto{

    IProduto p1;
    IProduto p2;
    //double preco;
    
    public ProdutoComposto(IProduto produto1, IProduto produto2){
        this.p1 = produto1;
        this.p2 = produto2;
       // this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return this.p1.getDescricao() + "\n" + this.p2.getDescricao();
    }

    @Override
    public double getPreco() {
    //    return this.preco;
        return p1.getPreco() + p2.getPreco();
    }
    
    
}
