package com.main;

public class Latihan1 {
    public static void main(String[] args) {

        /* Pola 1 wajik */

        // for (int x = 0; x < 9; x++) {
        // for (int y = 0; y < 9; y++) {
        // if ((x + y) <= 3 || (x - y) >= 5) {
        // System.out.print(" ");
        // } else {
        // System.out.print("* ");
        // }
        // if ((y - x) == 4) {
        // break;
        // }
        // if ((x + y) == 12) {
        // break;
        // }
        // }
        // System.out.print("\n");
        // }

        // Atau
        // int i, j;
        // int k = 9;

        // // Wajik bagian atas
        // // 'i' membuat (*) baris ke bawah karena ada '\n'
        // // 'j' membuat (*) baris ke kanan
        // // 'k' membuat batas (*) yang akan dibuat
        // for (i = 0; i < k; i++) {
        // for (j = 0; j < k; j++) {
        // if ((i + j) >= 9) {
        // System.out.print(" *");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.print("\n");
        // }

        // // Wajik bagian bawah
        // // 'i' membuat * baris ke bawah karena ada '\n'
        // // 'j' membuat * baris ke kanan
        // // 'k' membuat batas (*) yang akan dibuat
        // for (i = 0; i < k; i++) {
        // for (j = 0; j < k; j++) {
        // if ((j - i) >= 0) {
        // System.out.print(" *");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.print("\n");
        // }

        /*
         * Pola 2 : Menampilkan bilangan sederet bilangan 1 s.d 100 dengan ketentuan
         * setiap angka kelipatan tiga (3) yang ditampilkan kata “Tiga”, setiap
         * kelipatan lima (5) yang ditampilkan adalah kata “lima” dan setiap angka yang
         * merupakan kelipatan 3 dan 5 yang ditampilkan adalah “Unindra” Output: 1 2
         * tiga 4 lima tiga 7 8 tiga lima 11 unindra 13 14 unindra
         */

        // int bilanganAwal, bilanganAkhir;
        // bilanganAwal = 1;
        // bilanganAkhir = 100;

        // for (; bilanganAwal <= bilanganAkhir; bilanganAwal++) {
        // if (bilanganAwal % 3 == 0) {
        // if (bilanganAwal % 15 == 0) {
        // System.out.print("Unindra ");
        // } else {
        // System.out.print("Tiga ");
        // }
        // } else if (bilanganAwal % 5 == 0) {
        // System.out.print("Lima ");
        // } else {
        // System.out.print(bilanganAwal + " ");
        // }
        // }

        // cara dua
        // for(int i = 1;i<=100;i++) {
        // if((i%3) == 0 && (i%5) == 0) {
        // System.out.print(" Unindra ");
        // continue;
        // }
        // if((i % 3) == 0) {
        // System.out.print(" Tiga ");
        // continue;
        // }
        // if((i%5) == 0) {
        // System.out.print(" Lima ");
        // continue;
        // }
        // System.out.print(i+" ");
        // }

    }
}
