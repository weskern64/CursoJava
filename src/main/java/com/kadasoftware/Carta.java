package com.kadasoftware;

public class Carta {

    String cartaNombre;
    String palo;
    int valor;

    public Carta(String nombre, String palo, int valor) {
        this.cartaNombre = nombre;
        this.palo = palo;
        this.valor = valor;
    }

    public String getCartaNombre() {
        return cartaNombre;
    }

    public void setCartaNombre(String cartaNombre) {
        this.cartaNombre = cartaNombre;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                '}';
    }
}
