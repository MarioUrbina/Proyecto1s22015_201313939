/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Buses;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.xml.crypto.Data;

/**
 *
 * @author Saul
 */
public class Graficar {
    private File texto;
    public Graficar(){
        
    }
    public void archivoGraphviz(String codigo1, String nombre) {
        try {
            String path = nombre + ".txt";
            texto = new File(path);
            FileWriter writer = new FileWriter(texto);
            BufferedWriter buf = new BufferedWriter(writer);
            buf.write(
                    codigo1
                    
            );
            buf.flush();
            buf.close();
            writer.close();
            generar(nombre);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void graficaLista(){
        String texto = "";
        texto += "digraph grafica{\n";
        texto += "rankdir = TB; \n";
        texto += "node [shape = record, style = filled, colorfill = white]; \n";
        texto += "splines = line;\n";
        /*----------SUB GRAPH---------*/
        texto += "subgraph cluster_L {\n";
        texto += "node [shape = box style = filled];\n";
        texto += "label = \"LISTADO DE BUSES \"; \n";
        texto += "color = black\n";
        NodoDobleBus miNodo = Valores.lista.obtenerPrincipal();
        if(miNodo != null){
            if(miNodo.siguiente == null){
                texto += "G" + miNodo.bus.getIdentificador() + "[label=\"Numero de Bus:" + miNodo.bus.getIdentificador() + "\n Tipo: " +  "\"" + "]\n";
            }else{
                while(miNodo.siguiente != null){
                    Buses dato1 = miNodo.bus;
                    Buses dato2 = miNodo.siguiente.bus;
                    texto += "G" + dato1.getIdentificador() + "[label = \"Numero de Bus:" + dato1.getIdentificador()  + "\"" + "]\n";
                    texto += "G" + dato2.getIdentificador()+ "[label = \"Numero de Bus:" + dato2.getIdentificador() +  "\"" + "]\n";
                    texto += "G" + dato1.getIdentificador() + "->G" + dato2.getIdentificador() + ";\n";
                    texto += "G" + dato2.getIdentificador() + "->G" + dato1.getIdentificador() + ";\n";
                    miNodo = miNodo.siguiente;
                }
            }
        }
        texto += "}\n";
        /*--------------------------------------------------------------------------------------------------*/
        texto += "}";
        archivoGraphviz(texto, "graficaLista");
    }
    public void generar(String nombre) {
        try{
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = nombre + ".txt";
            String fileOutputPath = nombre + ".jpg";
            String tParam = "-Tjpg";
            String tOParam = "-o";
            String [] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        }catch(Exception e){

        }
    }
}
