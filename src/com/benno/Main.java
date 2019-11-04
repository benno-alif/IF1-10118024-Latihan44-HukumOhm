package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Hukum Ohm
     */

public class Main {

    public static void main(String[] args) {
	    Baterai baterai = new Baterai();
	    Baterai baterai1 = new Baterai(3, 12);

        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " Ampere");
        System.out.println("Hambatan  : " + baterai1.getHambatan() + " Ohm");
        System.out.println("Hasil Tegangan : " + baterai1.hitungTegangan() + " Volt");
    }
}
