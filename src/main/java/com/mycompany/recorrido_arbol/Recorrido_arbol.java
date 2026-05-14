/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recorrido_arbol;

/**
 *
 * @author Admin
 */
public class Recorrido_arbol {

    public static void main(String[] args) {
       NodoArbol tree= new NodoArbol<Integer>();
       tree.setDato(45);
       
       tree.setHijo(new NodoArbol[] {new NodoArbol(23,null), new NodoArbol(11,null)});
       tree.preOrden();
       tree.getHijo()[0].setHijo(0, 50);
       tree.getHijo()[1].setHijo(0, 40);
    }
    
}
