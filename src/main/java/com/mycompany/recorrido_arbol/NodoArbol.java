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
        
    }
    public void preOrden(){
        System.out.println(this.dato);
        if(hijo ==null) return;
        for(NodoArbol n: hijo){
            System.out.println(", ");
            n.preOrden();
        }
          
    }

    
}
