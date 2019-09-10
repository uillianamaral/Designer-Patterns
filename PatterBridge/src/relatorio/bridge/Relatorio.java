package relatorio.bridge;

import provabridge.ModoProcessar;

/**
 *
 * @author Uillian
 */
public abstract class Relatorio {
    
    private ModoProcessar modoProcessar;
    
    public void setModo(ModoProcessar modoProcessar){
        this.modoProcessar = modoProcessar;
    }
    
    private void calcular(){
        System.out.println("Calculando......");
    }
    
    private void buscar(){
        System.out.println("Buscando.....");
    }
    
    protected abstract void exportar();
    
    private void processar(){
        modoProcessar.processar();
    }
    
    public void criar(){
        buscar();
        calcular();
        exportar();
        processar();
    }
    
}
