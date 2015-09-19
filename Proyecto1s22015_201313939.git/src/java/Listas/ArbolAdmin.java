/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Mario
 */
public class ArbolAdmin {
    
    private NodoAVLAdmin nodo;
    
    public void insert(Comparable x){
    nodo = insertar(x,nodo);
    }
    
    private NodoAVLAdmin insertar(Comparable x,NodoAVLAdmin t ){
        if(t == null){
            t = new NodoAVLAdmin(null,null,null);
        }else if (x.compareTo(t.Admin)< 0){
            t.Izquierdo = insertar (x,t.Izquierdo);
            if( altura(t.Izquierdo) - altura(t.Derecho) == 2 ){
                if(x.compareTo(t.Izquierdo.Admin)< 0){
                    t = rotacionHijoIzquierdo(t);
                }else{
                    t = rotacionDobleHijoIzquierda(t);
                }
            }else if (x.compareTo(t.Admin)>0){
                t.Derecho = insertar (x,t.Derecho);
                if( x.compareTo(t.Derecho.Admin)>0){
                    t = rotacionHijoDerecho(t);
                }else {
                    t = rotacionDobleHijoDerecho(t);
                }
            
            }
        }
        return t;
    }
    private static int max(int izquierdaHeight, int derechaHeight){
        return izquierdaHeight > derechaHeight ? izquierdaHeight : derechaHeight;
    }
    
    private static NodoAVLAdmin rotacionHijoIzquierdo(NodoAVLAdmin t){
        NodoAVLAdmin aux2 = t.Izquierdo;
        t.Izquierdo = aux2.Derecho;
        aux2.Derecho = t;
        t.Altura = max(altura(t.Izquierdo),altura(t.Derecho)+1);
        aux2.Altura = max(altura(aux2.Derecho),t.Altura)+1;
        return aux2;
    }
    private static NodoAVLAdmin rotacionHijoDerecho(NodoAVLAdmin t){
        NodoAVLAdmin aux2 = t.Derecho;
        t.Izquierdo = aux2.Izquierdo;
        aux2.Izquierdo = t;
        t.Altura = max(altura(t.Izquierdo),altura(t.Derecho)+1);
        aux2.Altura = max(altura(aux2.Derecho),t.Altura)+1;
        return aux2;
    }
    
    private static NodoAVLAdmin rotacionDobleHijoIzquierda(NodoAVLAdmin aux){
        aux.Izquierdo = rotacionHijoDerecho(aux.Izquierdo);
        return rotacionHijoIzquierdo(aux);
    }
     private static NodoAVLAdmin rotacionDobleHijoDerecho(NodoAVLAdmin aux){
        aux.Derecho = rotacionHijoIzquierdo(aux.Derecho);
        return rotacionHijoDerecho(aux);
    }
     private static int altura (NodoAVLAdmin t){
         return t == null ? -1 : t.Altura;
     }
}
