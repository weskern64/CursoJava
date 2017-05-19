package com.kadasoftware;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Cartas {

    private final int NUM_CARTAS = 52;
    static  private String carta;
    static private List<String> paquete = new ArrayList<String>();
    static private String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "JOTO", "QUINA", "REY"};
    static private String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};

    public static void main(String args[]){
        initMazo();
        muestraMazo();
        sacaCarta();
    }

    static void sacaCarta() {

        Random random = new Random();
        Iterator i  = paquete.iterator();
        int cont = 1;
        while( i.hasNext() ) {
            int x = random.nextInt(paquete.size());
            System.out.println("Carta #"+cont+": "+paquete.get(x));
            paquete.remove(x);
            cont++;
        }
    }

    static void initMazo(){

        for  (int x = 0; x < palos.length; x++ ){
            for (int y = 0; y < caras.length; y++){
                paquete.add(caras[y]+" de "+palos[x]);
            }
        }
    }

    static void muestraMazo() {
        for (int x = 0; x < paquete.size(); x++) {
            System.out.println(paquete.get(x));
        }
    }
}
