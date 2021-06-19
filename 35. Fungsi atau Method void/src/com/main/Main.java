package com.main;

public class Main {
    public static void main(String[] args) {
        // void artinya hampa
        System.out.println(simpel());

        fungsiVoid("apapun");
        selamatPagi("emak");
    }

    private static void selamatPagi(String nama) {
        System.out.println(" Selamat pagi " + nama);
    }

    private static void fungsiVoid(String input) {
        System.out.println(input);
    }

    // fungsi atau method dengan kemabalian
    // sehingga menggunakan return untuk mengembaikan nilai(10.0f)
    private static float simpel() {
        return 10.0f;
    }
}
