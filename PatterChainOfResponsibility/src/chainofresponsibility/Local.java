package chainofresponsibility;

/**
 *
 * @author Uillian
 */
public class Local extends BuscadorDeArquivos{

    @Override
    public Boolean busca() {
        System.out.println("Buscando em local...");
        return false;
    }
 
    
}
