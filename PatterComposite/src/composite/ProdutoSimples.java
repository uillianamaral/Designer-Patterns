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
public class ProdutoSimples implements IProduto{

    private final String descricao;
    private final double preco;
    
    public ProdutoSimples(String nome, double preco){
        this.descricao = nome;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
    
    
}
