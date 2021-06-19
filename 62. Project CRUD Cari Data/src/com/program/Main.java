package com.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;
        while (isLanjutkan) {
            clearScreen();
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
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    cariData();
                    break;
                case "3":
                    System.out.println("\n===============");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("===============");
                    break;
                case "4":
                    System.out.println("\n===============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===============");
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    break;
                default:
                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih 1-5");
            }
            isLanjutkan = getYesorNo("\nApakah anda ingin melanjutkan");
        }
    }

    private static void cariData() throws IOException {
        try {
            File file = new File("D:\\Pemograman\\Java\\62. Project CRUD Cari Data\\src\\com\\program\\database.txt");
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukkan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();
        System.out.println(cariString);
        String[] keywords = cariString.split("\\s+");
        cekBukuDiDatabase(keywords);

    }

    private static void cekBukuDiDatabase(String[] keywords) throws IOException {
        FileReader fileInput = new FileReader(
                "D:\\Pemograman\\Java\\62. Project CRUD Cari Data\\src\\com\\program\\database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        String data = bufferInput.readLine();
        boolean isExist;
        int nomorData = 0;
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        while (data != null) {
            isExist = true;
            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            if (isExist) {
                view(data, nomorData);
            }

            data = bufferInput.readLine();
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");

    }

    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;
        try {
            fileInput = new FileReader(
                    "D:\\Pemograman\\Java\\62. Project CRUD Cari Data\\src\\com\\program\\database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null) {
            view(data, nomorData);
            data = bufferInput.readLine();
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
    }

    private static void view(String data, int nomorData) {

        nomorData++;
        StringTokenizer stringToken = new StringTokenizer(data, ",");
        stringToken.nextToken();
        System.out.printf("| %2d ", nomorData);
        System.out.printf("|\t%4s  ", stringToken.nextToken());
        System.out.printf("|\t%-20s   ", stringToken.nextToken());
        System.out.printf("|\t%-20s   ", stringToken.nextToken());
        System.out.printf("|\t%s   ", stringToken.nextToken());
        System.out.print("\n");
    }

    private static boolean getYesorNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();
        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }
}
