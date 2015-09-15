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
public class Administrador {
    String Correo;
    String Contrasena;

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
  
    public Administrador(){
    }
    
    public Administrador(String correo, String contrasena){
          this.Correo = correo;
          this.Contrasena = contrasena;
    }
    
    
}
