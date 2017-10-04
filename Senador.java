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
public class Senador extends Legislador{

    public Senador(String nombre, String Apellido, Float cedula, String cam,String provin) {
        super(nombre, Apellido, cedula, cam, provin);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return camara;
    }
    
}
