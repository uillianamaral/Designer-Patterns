package chainofresponsibility;

/**
 *
 * @author Uillian
 */
public class Servidor extends BuscadorDeArquivos{
    
    @Override
    public Boolean busca(){
        System.out.println("Buscando no servidor...");
        return true;
    }
}
