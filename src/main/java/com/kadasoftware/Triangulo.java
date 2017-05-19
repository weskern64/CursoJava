package com.kadasoftware;

/**
 * Created by lap on 11/05/2017.
 */
public class Triangulo {

    static public void main(String args[]) {
        dibujaTriangulo(3);
    }

    static void dibujaTriangulo(int line) {

        int j = 0;
        for(int i=0; i <= line-1; i++){
            System.out.println();
            for (j=line-1;  j>=0; j--){
                if(i >= j)
                //System.out.print("("+i+","+j+")" );
                    System.out.print(" * ");
            }
            //for (int x=line-1; x>=0;   x++){
            //    if (x <= j)
            //        System.out.println(" * ");
            //}
        }
        /*for(int i=1; i <= line-1; i++){
            System.out.println();
            for (int z=line-1;  z>=0; z--){
                if(i <= z)
                    //System.out.print("("+i+","+j+")" );
                    System.out.print(" * ");
            }
        }*/
    }
}
