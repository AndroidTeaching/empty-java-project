package com.teaching.android;

import com.teaching.android.persona.Persona;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        Persona p1 = new Persona("Paco", 200f);
        Persona p2 = new Persona("Juan", 33f);
        p1.pagar(p2, 10);

        System.out.println(p1.getNombre() + " tiene " + p1.getDinero() + "€");
        System.out.println(p2.getNombre() + " tiene " + p2.getDinero() + "€");
        p1.setDinero(0);
        System.out.println(p1.getNombre() + " tiene " + p1.getDinero() + "€");
    }

}










