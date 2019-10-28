package chainofresponsibility;

/**
 *
 * @author Uillian
 */
public class Cloud extends BuscadorDeArquivos{
    
    @Override
    public Boolean busca(){
        System.out.println("Buscando no Cloud..");
        return false;
    }
}
