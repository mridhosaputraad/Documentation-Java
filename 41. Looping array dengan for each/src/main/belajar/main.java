package main.belajar;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] arrayAngka = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        // looping standar
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayAngka[i]);
        }

        // looping dengan property array
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println(arrayAngka[i]);
        }

        // looping khusus untuk collection <- array
        for (int angka : arrayAngka) {
            System.out.println(angka);
        }

        // jumlah data yang isinya random
        Random rd = new Random(); // Random object
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // naro angka random ke dalam array
            System.out.println(arr[i]); // print array
        }
    }
}
