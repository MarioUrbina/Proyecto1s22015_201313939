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
public class Buses {
    int Identificador;
    
    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }
        
    public Buses(){
    }
    
    public Buses(int id){
        this.Identificador = id;
        
    }
    
}
