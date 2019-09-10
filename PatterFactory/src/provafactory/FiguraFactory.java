
package provafactory;

/**
 *
 * @author Uillian
 */
public class FiguraFactory {
    
      public IFigura getFigura(String nomeFigura){
          
          if(nomeFigura.equalsIgnoreCase("Circulo")){
              return new Circulo();
          }
          if(nomeFigura.equalsIgnoreCase("Retangulo")){
              return new Retangulo();
          }
          if(nomeFigura.equalsIgnoreCase("Quadrado")){
              return new Quadrado();
          }
          
          return null;
      
      }   
    
}
