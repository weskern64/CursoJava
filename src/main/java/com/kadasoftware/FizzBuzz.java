package com.kadasoftware;

public class FizzBuzz {

    String fizz = "Fizz";
    String buzz = "Buzz";

    static String[] resultado;

    static {
        resultado = new String[100];
    }

    static int [] lista = new int[100];

    public static void main(String args[]){

        game();

        muestra();
    }

    public static void game() {

        initLista();

        for (int i = 0; i < 100; i++) {

                if (  lista[i]%3 == 0 && lista[i] > 0 ){
                    resultado[i] = String.valueOf(lista[i])+ " " +"Fizz";

                    if( lista[i]%5 == 0 ){
                        resultado[i] = String.valueOf(lista[i]) + " " + "FizzBuzz";
                    }
                }

                if ( lista[i]%5 == 0 && lista[i] > 0 ) {
                    resultado[i] = String.valueOf(lista[i]) + " " + "Buzz";

                    if (lista[i]%3 == 0){
                        resultado[i] = String.valueOf(lista[i]) + " " + "FizzBuzz";
                    }
                }
        }
    }

    public static void initLista() {
        for (int i = 0; i < 100; i++) {
            lista[i] = i;
        }
    }

    public static void muestra() {
        for (int i = 0; i < 100; i++) {
            if (resultado[i] != null)
            System.out.println(resultado[i]);
        }
    }
}
