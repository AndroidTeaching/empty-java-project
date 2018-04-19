package com.teaching.android;

public class Punto {

    // Atributos
    private int x;
    private int y;

    public Punto() {

    }

    public Punto(int pX, int pY) {
        x = pX;
        y = pY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(int pX, int pY) {
        int diferenciaX = pX - x;
        int diferenciaY = pY - y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);

        return resultado;
    }

    public double distancia(Punto pDestino) {
        double resultado = distancia(pDestino.x, pDestino.y);

        return resultado;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}








