/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Ruta {
     String Nombre;
    ArrayList<Estacion> listaEstacion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Estacion> getListaEstacion() {
        return listaEstacion;
    }

    public void setListaEstacion(ArrayList<Estacion> listaEstacion) {
        this.listaEstacion = listaEstacion;
    }
   
    public Ruta(){
    }
    
    public Ruta(String nombre, ArrayList<Estacion> lista){
         this.Nombre = nombre;
         this.listaEstacion = lista;
        
    }
    
    
}
