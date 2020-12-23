
package laboratorio;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import lab_package.*;

/**
 *
 * @author EAJ
 */
public class Laboratorio {
    
    public static void main(String[] args) throws Exception {
  
        Ubicacion ubicacion1 = new Ubicacion(123,321);
        List<Articulo>lstArticulo = new ArrayList();
        LocalDate Fechahoy = LocalDate.now();
        LocalTime hora = LocalTime.now();
        Contacto contacto1 = new Contacto("@hotmail.com","1155664173",ubicacion1);
        Cliente cliente1 = new Cliente("Kuznik","Javier",12345678,'h',1,contacto1);
        Entrega entrega1 = new Entrega(1,Fechahoy,false);
        Carrito c1 = new Carrito(1,Fechahoy,hora,false,1,cliente1,entrega1);
        Comercio comercio = new Comercio("Almacen Granate",123465789l,50,10,3,20,15,1,contacto1);
        comercio.getLstCarrito().add(c1);
        comercio.setLstArticulo(lstArticulo);
    }
}