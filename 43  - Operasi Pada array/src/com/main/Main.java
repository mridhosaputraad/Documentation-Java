package com.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka1 = { 1, 2, 3, 4, 5 };

        // Mengubah array menjadi string

        // mengkopi array
        int[] arrayAngka2 = new int[5];

        // Mengkopi dengan loop
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka2);

        // Mengkopi dengan copy of
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka3);

        // mengkopi dengan copyofrange
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka4);

        // fill array
        int[] arrayAngka5 = new int[5];
        Arrays.fill(arrayAngka5, 2);
        printArray(arrayAngka5);

        // komparasi array
        int[] arrayAngka6 = { 1, 2, 3, 4, 5 };
        int[] arrayAngka7 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7)); // boolean

        // Mengecek mana array yang lebih besar
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7)); // integer

        // ngecek mana index yang berbeda
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7)); // integer

        // Sort array
        int[] arrayAngka8 = { 1, 4, 5, 6, 3, 6, 7, 4 };
        Arrays.sort(arrayAngka8);

        // Search array
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

    }

    private static void printArray(int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
