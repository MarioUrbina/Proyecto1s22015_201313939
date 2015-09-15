/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Clases.*;

/**
 *
 * @author Mario
 */

public class NodoDobleBus {
   public Buses bus;
   public NodoDobleBus anterior;
   public NodoDobleBus siguiente;
    
   public NodoDobleBus(Buses bus){
       this(bus,null,null);
   }
    
   public NodoDobleBus(Buses buses,NodoDobleBus sig, NodoDobleBus ant){
   bus= buses;
   siguiente= sig;
   anterior = ant;
   }  
   
}
