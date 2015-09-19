/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Estacion;

/**
 *
 * @author Mario
 */
public class NodoAVLEstacion {
    public Estacion Est;
    public NodoAVLEstacion Izquierdo;
    public NodoAVLEstacion Derecho;
    public int Altura;
    
    public NodoAVLEstacion(Estacion est){
       this(est,null,null);
   }
    
    public NodoAVLEstacion (Estacion est, NodoAVLEstacion izq , NodoAVLEstacion der ){
        this.Est = est;
        this.Izquierdo = izq;
        this.Derecho = der;
        Altura = 0;
    } 
}
