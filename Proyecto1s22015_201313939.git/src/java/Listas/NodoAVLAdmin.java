/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Administrador;

/**
 *
 * @author Mario
 */
public class NodoAVLAdmin {
    public Administrador Admin;
    public NodoAVLAdmin Izquierdo;
    public NodoAVLAdmin Derecho;
    public int Altura;
    
    public NodoAVLAdmin(Administrador admin){
       this(admin,null,null);
   }
    
    public NodoAVLAdmin (Administrador admin, NodoAVLAdmin izq , NodoAVLAdmin der ){
        this.Admin = admin;
        this.Izquierdo = izq;
        this.Derecho = der;
        Altura = 0;
    } 
    
    
}
