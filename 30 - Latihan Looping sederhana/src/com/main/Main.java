package com.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir = inputUser.nextInt();
        inputUser.close();

        total = 0;

        // while (nilaiAwal <= nilaiAkhir) {
        // total = total + nilaiAwal;
        // System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        // nilaiAwal++;
        // }

        // do {
        // total = total + nilaiAwal;
        // System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        // nilaiAwal++;
        // } while (nilaiAwal <= nilaiAkhir);

        for (; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        }

    }
}
