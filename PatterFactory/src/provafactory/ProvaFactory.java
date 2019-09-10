package provafactory;
/**
 *
 * @author Uillian
 */
public class ProvaFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        FiguraFactory figuraFactory = new FiguraFactory();
        
        try{
            
        IFigura f = figuraFactory.getFigura("Circulko");
        f.desenhar();
       
        
        }catch (NullPointerException npe){
            System.out.println("Objeto nao existente");
        }catch(Exception ex){
            System.out.println("Ocorreu um erro no programa");
        }
        
    }
    
}
