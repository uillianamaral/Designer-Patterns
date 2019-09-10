package provastrategy;

/**
 *
 * @author Uillian
 */
public class Viagem {
    
    private ITransporte transporte;
    
    public Viagem(ITransporte transporte){
        this.transporte = transporte;
    }
    
    public void setViagem(ITransporte transporte){
        this.transporte = transporte;
    }
    
    public void modoViagem(){
        this.transporte.transporte();
    }

 
}
