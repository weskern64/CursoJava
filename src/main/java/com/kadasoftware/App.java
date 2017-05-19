package com.kadasoftware;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Pato pato = new Pato() {
            @Override
            public String graznar() {
                return null;
            }
        };

        String name ="kasdasd";
        name ="Hello there";

        //System.out.printf(name);

        //System.out.println( "Hello World!" );

        //Collecciones collecciones = new Collecciones();

        //collecciones.otroMapa();

        Mazo mazo = new Mazo();
        mazo.creaMazo();
        mazo.muestraMazo();



    }
}
