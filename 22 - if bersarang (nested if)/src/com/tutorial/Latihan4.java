package com.tutorial;

import java.util.*;

public class Latihan4 {
    public static void main(String[] args) {
        float ipk, pengalaman;
        String nama, perusahaan;
        System.out.println("PROGRAM MEREKRUT KARYAWAN");
        System.out.print("Masukkan nama :");
        Scanner inputstr = new Scanner(System.in);
        nama = inputstr.nextLine();
        System.out.print("masukkan nilai ipk :");
        Scanner inputangka = new Scanner(System.in);
        ipk = inputangka.nextFloat();
        if (ipk == 4) {
            System.out.println("Selamat anda " + nama + " lulus ssleksi ");
        } else if (ipk < 3.5 && ipk >= 3) {
            System.out.print("masukkan lama penglaman kerja :");
            pengalaman = inputangka.nextFloat();
            if (pengalaman > 6) {
                System.out.println("Selamat anda " + nama + " lulus ssleksi ");
            } else if (pengalaman >= 3 && pengalaman <= 5) {
                System.out.println("anda harus ikut tes lebih lanjut");
            } else {
                System.out.println("anda tidak lulus seleksi");
            }
        } else if (ipk >= 3.5) {
            System.out.println("perusahaan yang pernah dimagangkan :");
            perusahaan = inputstr.nextLine();
            String tester = "google";
            if (perusahaan == tester) {
                System.out.println("Selamat anda " + nama + " lulus ssleksi ");
            } else {
                System.out.println("anda harus mengikuti tes lebih lanjut");
            }
        } else {
            System.out.println("Anda tidak lulus seleksi");
        }
    }
}
