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
public class AsignacionChofer {
    
    int idBus;
    int idRuta;
    ArrayList<ControlChofer> listaHoras;
    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public ArrayList<ControlChofer> getListaHoras() {
        return listaHoras;
    }

    public void setListaHoras(ArrayList<ControlChofer> listaHoras) {
        this.listaHoras = listaHoras;
    }
  
    
    
}
