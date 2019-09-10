package provastrategy;

/**
 *
 * @author Uillian
 */
public class ProvaStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Viagem v = new Viagem(new Aviao());      
      v.modoViagem();
      
      v.setViagem(new Carro());      
      v.modoViagem();
      
      
    }
}