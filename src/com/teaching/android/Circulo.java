package com.teaching.android;

public class Circulo {

    // Atributos
    private Punto centro;
    private int radio;

    public Circulo() {

    }

    public Circulo(int pX, int pY, int pRadio) {
        radio = pRadio;
        centro = new Punto(pX, pY);
    }

    public Circulo(Punto pCentro, int pRadio) {
        radio = pRadio;
        centro = pCentro;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunference() {
        double circunferencia = 2 * Math.PI * radio;
        return circunferencia;
    }
}
