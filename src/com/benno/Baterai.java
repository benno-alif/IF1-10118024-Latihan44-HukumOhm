package com.benno;

public class Baterai {
    private float kuatArus, hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan beda potensial pada ujung-ujung kawat penghantar tersebut " +
                "asalkan suhu kawat dijaga konstan.\n");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan(){
        return getKuatArus() * getHambatan();
    }
}
