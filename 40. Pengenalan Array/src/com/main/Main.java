package com.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Pengalokasian memory-nya heap
        // assignment
        // tipedata [] nama = {komponen, komponenen}

        System.out.println("Assignment Array");

        int[] arrayInteger = { 1, 2, 3, 4 };

        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);

        // Deklarasi
        // tipedata[] nama = new int [jumlahArray];

        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        // Mengubah array menjadi string
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}

// cmiiw java bisa ambil value selain dari index itu bisa pake data collection
// kalo array mau di isi input user bisa pakai arraylist, kalau mau dynamic si
// jumlah membernya
// kalau fiks panjang array bisa pakai string biasa