/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Chofer;

/**
 *
 * @author Mario
 */
public class NodoAVLChofer {
    public Chofer Cho;
    public NodoAVLAdmin Izquierdo;
    public NodoAVLAdmin Derecho;
    public int Altura;
    
    public NodoAVLChofer(Chofer cho){
       this(cho,null,null);
   }
    
    public NodoAVLChofer (Chofer cho, NodoAVLAdmin izq , NodoAVLAdmin der ){
        this.Cho = cho;
        this.Izquierdo = izq;
        this.Derecho = der;
        Altura = 0;
    } 
    
    
}
