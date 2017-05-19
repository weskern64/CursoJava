package com.kadasoftware;


import java.util.Scanner;

public class BlackJack {

    static private boolean jugar = true;
    static private Scanner scaner = new Scanner(System.in);

    public static void main(String args[]) {

        do {
            System.out.println("BlackJack Game");
	    System.out.println("seleciona: ");

	    int respuesta = scaner.nextInt();
	    if (respuesta != 0) {
	        jugar = true;
	    }

        }while(jugar);

    }

}
