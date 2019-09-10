package templete;

/**
 *
 * @author Uillian
 */
public abstract class FolhaDePag {
    
    private void buscarHoras(){
        System.out.println("Buscando Horas Extras");
    }
    
    private void calcularSalario(){
        System.out.println("Calcular Salario");
    }
    
    protected abstract void enviaDados();
    
    public void processaDados(){
        buscarHoras();
        calcularSalario();
        enviaDados();
    }
    
}
