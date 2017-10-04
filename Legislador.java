/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiii;

/**
 *
 * @author Joel Corona
 */

public abstract class Legislador extends Personas{
    //Atributos
    String provinciaQueRepresenta ;
    String camara;
    
    public Legislador(String nombre, String Apellido, Float cedula, String cam, String provin) {
        super(nombre, Apellido, cedula, cam, provin);
        provinciaQueRepresenta =provin;
        camara=cam;
    }
    
    public abstract String getCamaraEnQueTrabaja();
    public String getProvi(){
        
       return(provinciaQueRepresenta);
    }
}
    
    
  

