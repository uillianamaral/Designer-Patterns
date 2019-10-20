package observer;

/**
 *
 * @author Uillian
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Termometro t = new Termometro();
        t.addObservador(new App());
        t.addObservador(new Display());
        t.setTemperatura(20.3);
        
        Barometro a = new Barometro();
        a.addObservador(new Display());        
        a.setPrecao(200);
        
    }
    
}
