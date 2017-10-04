
package proyectoiii;
import java.util.Scanner;

/**
 *
 * @author Joel Corona
 */
public class ProyectoIII {
 
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Diputado[] gente = new Diputado[2];
        
        for(int i=0; i<2; i++){
            System.out.println("Ingrese nombre, apellido, cedula, camara y provincia ");
            gente[i]= new Diputado(sc.next(),sc.next(),sc.nextFloat(), sc.next(), sc.next());
        }
        
        for(int i=0; i<2; i++){
            System.out.println("La Camara del "+i+" es: "+gente[i].getCamaraEnQueTrabaja()+"");
            System.out.println("La provincia del "+i+" es: "+gente[i].getProvi()+"");
        }
   
        
        
    }
    
}
