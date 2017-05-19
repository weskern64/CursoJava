package com.kadasoftware;


public class Suma {

    static int sum = 0;

    public static void main(String args[]){

        System.out.printf( "Resultado "+ String.valueOf(suma(2,1,1)));
    }

    static public int suma(int a, int b, int c){

        int[] z = {b,c};
            for (int j=0; j<2;j++) {
                if (a != z[j]){
                    sum  += a + z[j];
                }
            }
            if(sum > 0)
                sum = sum -a;
        return sum;
    }
}
