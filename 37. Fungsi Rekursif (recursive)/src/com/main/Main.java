package com.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = userInput.nextInt();

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println(" hasilfaktorial = " + faktorial);

    }

    // Fungsi rekursif

    private static int hitungFaktorial(int parameter) {
        System.out.println("paramter " + parameter);

        if (parameter == 1) {
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }

    private static int jumlahNilai(int parameter) {
        System.out.println("paramter " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println("nilai = " + parameter);

        if (parameter == 0) {
            return;
        }

        parameter--;
        printNilai(parameter);
    }
}
