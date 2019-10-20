package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uillian
 */
public abstract class Observado {
    
    private final List<Observador> observadores = new ArrayList<>();
    
    public void addObservador(Observador observador){
        this.observadores.add(observador);

    }
    protected void notificaTodos() {
        observadores.forEach((observador) -> observador.notifica());
    }
    
}
