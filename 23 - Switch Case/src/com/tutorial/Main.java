package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama: ");
        input = inputUser.next();
        inputUser.close();

        // Ekspresinya berupa satuan (int,long,byte,short), String atau enum
        // rekomendasi digunakan untuk perubahan menu dan behavior
        /*
         * // Contohnya untuk rapot misal A baik, B baik dst.. // untuk fungsi dayOfWeek
         * biasanya angka. Kita tidak mau angka, tapi kata berarti 0 itu minggu, 1 itu
         * senin dst // Bisa juga untuk tombol game, kalo menekan keyboard a belok kiri,
         * keyboard b belok kanan dst.. // intinya switch digunakan untuk nilai tertentu
         */
        switch (input) {
            case "otong":
                System.out.println("saya otong dan saya hadir");
                break;
            default:
                System.out.println(input + " tidak hadir");
        }

        System.out.println("program selesai");
    }
}
