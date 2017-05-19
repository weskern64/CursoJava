package com.kadasoftware;

import java.util.Stack;

public class Mazo {

    static private int NUM_CARTAS = 52;
    static private String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "JOTO", "QUINA", "REY"};
    static private String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};
    static private Carta[] paquete = new Carta[NUM_CARTAS];
    static private Stack<Carta> pila = new Stack<Carta>();

    public void creaMazo() {
        for (int x = 0; x < palos.length;x++ ) {
            for (int y = 0; y < caras.length; y++ ) {
                if (  caras[y].equals("JOTO") || caras[y].equals("QUINA") || caras[y].equals("REY") ) {
                    pila.add( new Carta(caras[y],palos[x],10 ) );
                }else
                    pila.add( new Carta(caras[y],palos[x],y+1) );
            }
        }
    }

    public void muestraMazo() {
        for (int x = 0; x < pila.size(); x++) {
            System.out.println(pila.elementAt(x).getCartaNombre()+" de "+pila.elementAt(x).getPalo()+"  :  "+pila.elementAt(x).getValor());
        }
    }
}
