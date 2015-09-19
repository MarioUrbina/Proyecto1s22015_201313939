/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 *
 * @author Mario
 */
public class ControlChofer {

    String inicio;
    String termino;
    String fecha ;
    
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   public ControlChofer(){
   }
   public ControlChofer(String in, String ter, String fe){
       
       this.inicio = in;
       this.termino = ter;
       this.fecha = fe;
   }
    
    
    
    
}
