package chainofresponsibility;

/**
 *
 * @author Uillian
 */
public abstract class BuscadorDeArquivos {
    
    BuscadorDeArquivos proximo;
    
    public void setProximaBusca(BuscadorDeArquivos proximo){
        this.proximo = proximo;
    }
    
    public abstract Boolean busca();
    
    public Boolean bucadorEmCadeia(){
        if(busca()== true){
            return true;
        } else if (this.proximo != null) {
            return proximo.bucadorEmCadeia();
        } else {
            return false;
        }
    }
    
}
