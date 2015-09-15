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
public class Estacion {
    int Identificador;
    String Nombre;
    String Contrasena;
    String Tipo;

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public Estacion(){
    }
    
    public Estacion(int identificador, String nombre, String contrasena, String tipo){
        this.Identificador = identificador;
        this.Nombre = nombre;
        this.Contrasena = contrasena;
        this.Tipo = tipo;
    }
    
    
    
}
