package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uillian
 */
public class NotaFiscal {
    
    List<IProduto> produto = new ArrayList<>();
    
    public void addProduto(IProduto item){
        this.produto.add(item);
    }
    
    public void imprimeNota(){
        for(IProduto p: produto){
            System.out.println(p.getDescricao() + "\n\nTOTAL: " + p.getPreco());
        }
    }
    
}
