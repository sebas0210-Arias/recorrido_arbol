/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recorrido_arbol;

/**
 *
 * @author Admin
 */
public class NodoArbol <T>{
    private T dato;
    private NodoArbol[] hijo;
    
    public NodoArbol(T dato, NodoArbol[] hijo){
        this.dato= dato;
        this.hijo=hijo;
        
    }
    
    
    NodoArbol() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public T getDato(){
        return dato;
    }
    
    public NodoArbol[] getHijo() {
        return hijo;
    }
    
    public void setDato (T dato){
        this.dato=dato;
    }
    
    public void setHijo(NodoArbol[] hijo) {
        this.hijo=hijo;
    }
    public void setHijo(int pos, T dato){
    if(hijo == null){
        hijo = new NodoArbol[pos + 1];
    }

    // si el arreglo es muy pequeño
    if(pos >= hijo.length){

        NodoArbol[] nuevo = new NodoArbol[pos + 1];

        for(int i = 0; i < hijo.length; i++){
            nuevo[i] = hijo[i];
        }

        hijo = nuevo;
    }

    hijo[pos] = new NodoArbol(dato, null);
    }
        
    
   public void preOrden() {
    // 1. Visitar raíz
    System.out.print(this.dato + " ");

    // Si no tiene hijos termina
    if (hijo == null) return;

    // 2. Recorrer hijos
    for (NodoArbol n : hijo) {
        if (n != null) {
            n.preOrden();
        }
    }
}
   public void inOrden(){

    // recorrer primer hijo
    if(hijo != null && hijo.length > 0 && hijo[0] != null){
        hijo[0].inOrden();
    }

    // visitar raíz
    System.out.print(this.dato + " ");

    // recorrer los demás hijos
    if(hijo != null){

        for(int i = 1; i < hijo.length; i++){

            if(hijo[i] != null){
                hijo[i].inOrden();
            }
        }
    }
   }
          
    }

    

