package com.kadasoftware;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaquinaDispensadora {

    static Map<String, Double> cambioADar = new HashMap<>();
    static Map<String, Integer> totalMonedas = new HashMap<>();

    static  double totalCambio;
    static BigDecimal precioProducto;
    static String[] denominaciones = {"0.1", "0.2", "0.5", "1.0"};
    static int[] totalMonedasPorDenominacion = {5, 5, 5, 1};

    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {

        //System.out.println("Ingrese el precio: ");
        //double precio = scanner.nextDouble();

//        scanner.nextLine();
        Map<String, Double> cambioADar = darCambio(15, 7.5);
        /*for(int cambio : cambioADar) {
            System.out.println(cambio);
        }*/

        for (Map.Entry<String, Double> entry : cambioADar.entrySet())
        {
            if(entry.getValue() > 0) {
                System.out.println("Entregue " + entry.getValue() + " monedas de: $" + entry.getKey());
            }

        }
    }

    public static  Map<String, Double> darCambio(double pago,  double precio) {
        precioProducto = new BigDecimal(precio);
        inicializarCambioADar();

        if(pago < precioProducto.floatValue()) {
            throw new IllegalArgumentException("El pago debe ser mayor igual al: " + precioProducto);
        }

        if(pago == precioProducto.doubleValue()) {
            //return totalMonedasCambio;
            return cambioADar;
        }


        BigDecimal cambio = new BigDecimal(pago).subtract(precioProducto);
        double  cambioIdeal = cambio.floatValue();

        for(int i = denominaciones.length-1; i >= 0; i--) {
            BigDecimal cambioTemporal = cambio.divide(new BigDecimal(denominaciones[i]),  2, BigDecimal.ROUND_UP);
            int totalMonedasCambio = cambioTemporal.intValue();
            if(totalMonedasCambio > totalMonedasPorDenominacion[i]) {
                totalMonedasCambio = totalMonedasPorDenominacion[i];
            }
            cambioADar.put(denominaciones[i].toString(), totalMonedasCambio * 1.0);
            BigDecimal sustrayendo = new BigDecimal(totalMonedasCambio).multiply(new BigDecimal(denominaciones[i]));
            cambio = cambio.subtract(sustrayendo);

            if(cambio.compareTo(BigDecimal.ZERO) <= 0) {
                break;
            }
        }

        if(totalCambio < cambioIdeal) {
            System.out.println("CAMBIO FALTANTE ES DE: " + (cambioIdeal - totalCambio));
        }

        return cambioADar;
    }

    private static void inicializarCambioADar() {
        totalCambio  = 0.0;
        for(int i = 0; i <= denominaciones.length -1; i++) {
            cambioADar.put(denominaciones[i], 0.0);
            totalMonedas.put(denominaciones[i], totalMonedasPorDenominacion[i]);
            totalCambio += (Double.parseDouble(denominaciones[i]) * totalMonedasPorDenominacion[i]);
        }
    }
}
