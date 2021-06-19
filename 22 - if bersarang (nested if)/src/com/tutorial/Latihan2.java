package com.tutorial;

import java.util.*;

public class Latihan2 {
    public static void main(String[] args) {
        // membuat program suwit jawa
        // computer akan memilih pilahnnya secara acak
        // menentukan rules pilhan sendiri
        // lalu pilihan saya akan melawan pilihan konmputeere
        // hasilkan output
        Scanner input = new Scanner(System.in);
        Random nilaiRandom = new Random();// buat objek random
        Main akses = new Main();// buat objek supaya bisa di akses
        int pilihanCom = (int) (4 * Math.random() + 0);
        String pilihanSaya = input.nextLine();
        String contoh = akses.hewanComputer(pilihanCom);
        String hasil;
        if (pilihanSaya.equals(contoh)) {
            System.out.println("seri");
        } else if (pilihanSaya.equals("semut")) {
            hasil = contoh.equals("gajah") ? "menang" : "kalah";
            System.out.println("anda memilih semut dan computer memilih " + contoh + " maka anda " + hasil);
        } else if (pilihanSaya.equals("orang")) {
            hasil = contoh.equals("semut") ? "menang" : "kalah";
            System.out.println("anda memilih orang dan computer memilih " + contoh + " maka anda " + hasil);
        } else if (pilihanSaya.equals("gajah")) {
            hasil = contoh.equals("orang") ? "menang" : "kalah";
            System.out.println("anda memilih gajah komputer memilih " + contoh + "maka anda " + hasil);
        } else {
            System.out.println("anda memasukan inputan yg non valid");
        }

    }
}
