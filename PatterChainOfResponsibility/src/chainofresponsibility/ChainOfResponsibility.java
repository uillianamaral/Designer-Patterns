package chainofresponsibility;

/**
 *
 * @author Uillian
 */
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        BuscadorDeArquivos spotifyFree = new Local();
        Servidor spotifyFamily = new Servidor();
        Cloud spotifyPremium = new Cloud();
        spotifyFree.setProximaBusca(spotifyFamily);
        spotifyFamily.setProximaBusca(spotifyPremium);
        
        Boolean encontrei = spotifyFree.bucadorEmCadeia();
        System.out.println("Resultado: " + encontrei);
        
        
    }
    
}
