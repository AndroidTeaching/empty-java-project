package com.teaching.android.persona;

public class Persona {

    // Atributos
    private String nombre;
    private float dinero;

    public Persona(String pNombre, float pDinero) {
        nombre = pNombre;
        dinero = pDinero;
        System.out.println("Creada persona con nombre:" + nombre
                            + " y dinero: " + dinero + "€");
    }

    public void pagar(Persona quienPaga, float pDinero) {
        this.dinero = this.dinero + pDinero;
        quienPaga.dinero = quienPaga.dinero - pDinero;
        System.out.println(quienPaga.nombre + " ha pagado a " +
                            this.nombre + " " + pDinero + "€");
    }

    public String getNombre() {
        return nombre;
    }

    public float getDinero() {
        return dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
}


































