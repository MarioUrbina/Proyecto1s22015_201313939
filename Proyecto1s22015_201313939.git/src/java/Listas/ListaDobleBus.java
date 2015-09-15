/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Buses;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class ListaDobleBus {
     private NodoDobleBus principal;
    private NodoDobleBus fin;
    
    public ListaDobleBus(){
        principal=fin=null;
    }
    
    // Lista Vacia
    
    public boolean VerificarLista(){
        return principal==null;
    }
    
    public NodoDobleBus obtenerPrincipal()
    {
        return principal;
    }
    
    public NodoDobleBus obtenerFinal()
    {
        return fin;
    }
    
     public void Agregar(Buses bus){
        if(!VerificarLista()){
            fin= new NodoDobleBus(bus,null,fin);
            fin.anterior.siguiente = fin;
        }else{
            principal= fin= new NodoDobleBus(bus);
        }
    }
    public Buses  eliminar(int id){ 
      Buses elemento = principal.bus;
      if (principal.bus.getIdentificador() == fin.bus.getIdentificador()){
          principal=fin= null;
      }else{
          principal= principal.siguiente;
          principal.anterior = null; 
      }
        return elemento;
    }
    
     
     public void mostarListaInicio(){
          if(!VerificarLista()){
             String datos = "<=>";
             NodoDobleBus aux = principal;
             while(aux!= null ){
                 datos = datos + "[ Identificador: " + aux.bus.getIdentificador() +  "]<=>";
                 aux = aux.siguiente;
             }
             JOptionPane.showMessageDialog(null, datos, 
                     "Mostrando Lista de Buses",JOptionPane.INFORMATION_MESSAGE);
            }
     }
    
}
