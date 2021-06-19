package com.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
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
                    tambahData();
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

    private static void tambahData() throws IOException {
        FileWriter fileOutput = new FileWriter(
                "D:\\Pemograman\\Java\\63. Projek CRUD Tambah Data\\src\\com\\program\\database.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;
        System.out.print("masukkan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("masukkan nama judul: ");
        judul = terminalInput.nextLine();
        System.out.print("masukkan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("masukkan nama tahun, format=(YYYY): ");
        tahun = ambilTahun();
        String[] keywords = { tahun + "," + penulis + "," + penerbit + "," + judul };
        System.out.println(Arrays.toString(keywords));
        boolean isExist = cekBukuDiDatabase(keywords, false);
        if (!isExist) {
            System.out.println(ambilEntryPerTahun(penulis, tahun));
            long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;
            String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("primary key  : " + primaryKey);
            System.out.println("tahun terbit : " + tahun);
            System.out.println("penulis      : " + penulis);
            System.out.println("judul        : " + judul);
            System.out.println("penerbit     : " + penerbit);
            boolean isTambah = getYesorNo("Apakah akan ingin menambah data tersebut");
            if (isTambah) {
                bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        } else {
            System.out.println("buku yang anda akan masukan sudah tersedia di database dengan data berikut:");
            cekBukuDiDatabase(keywords, true);
        }
    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader(
                "D:\\Pemograman\\Java\\63. Projek CRUD Tambah Data\\src\\com\\program\\database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;
        while (data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");
            penulis = penulis.replaceAll("\\s+", "");
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();
            }
            data = bufferInput.readLine();
        }
        return entry;
    }

    private static String ambilTahun() throws IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        while (!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e) {
                System.out.println("Format tahun yang anda masukan salah, format=(YYYY)");
                System.out.print("silahkan masukan tahun terbit lagi: ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
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
        cekBukuDiDatabase(keywords, true);
    }

    private static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException {
        FileReader fileInput = new FileReader(
                "D:\\Pemograman\\Java\\63. Projek CRUD Tambah Data\\src\\com\\program\\database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;
        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
        }
        while (data != null) {
            isExist = true;
            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            if (isExist) {
                if (isDisplay) {
                    view(data, nomorData);
                } else {
                    break;
                }
            }
            data = bufferInput.readLine();
        }
        if (isDisplay) {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
        }
        return isExist;
    }

    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;
        try {
            fileInput = new FileReader(
                    "D:\\Pemograman\\Java\\63. Projek CRUD Tambah Data\\src\\com\\program\\database.txt");
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
