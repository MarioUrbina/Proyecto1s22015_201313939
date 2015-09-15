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
public class Chofer {
    String Nombre;
    String Apellido;
    String Correo;
    String Contrasena;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }   
    
    public Chofer(){
    }
    
    public Chofer(String nombre, String apellido, String correo, String contrasena){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Correo = correo;
        this.Contrasena = contrasena;
    }
    
    
}
