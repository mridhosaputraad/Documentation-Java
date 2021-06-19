package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // do {
        // aksi
        // } while (kondisi);

        System.out.println("awal program");

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            if (a == 10) {
                kondisi = false;
            }
        } while (kondisi);

        System.out.println("ini adalah akhir program");
    }
}
