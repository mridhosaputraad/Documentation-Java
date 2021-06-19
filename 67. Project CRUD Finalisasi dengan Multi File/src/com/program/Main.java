package com.program;

import java.io.IOException;
import java.util.Scanner;

import crud.util.Operasi;
import crud.util.Utility;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;
        while (isLanjutkan) {
            Utility.clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat Seluruh Buku");
            System.out.println("2.\tCari Data Buku");
            System.out.println("3.\tTambah Data Buku");
            System.out.println("4.\tUbah Data Buku");
            System.out.println("5.\tHapus Data Buku");
            System.out.print("\n\nPilihan Anda : ");
            pilihanUser = terminalInput.next();
            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    Operasi.tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    Operasi.cariData();
                    break;
                case "3":
                    System.out.println("\n===============");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("===============");
                    Operasi.tambahData();
                    Operasi.tampilkanData();
                    break;
                case "4":
                    System.out.println("\n===============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===============");
                    Operasi.updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    Operasi.deleteData();
                    break;
                default:
                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih 1-5");
            }
            isLanjutkan = Utility.getYesorNo("\nApakah anda ingin melanjutkan");
        }
    }
}
