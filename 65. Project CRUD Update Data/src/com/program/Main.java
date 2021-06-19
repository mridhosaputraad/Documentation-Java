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
                    tampilkanData();
                    break;
                case "4":
                    System.out.println("\n===============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===============");
                    updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    deleteData();
                    break;
                default:
                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih 1-5");
            }
            isLanjutkan = getYesorNo("\nApakah anda ingin melanjutkan");
        }
    }

    private static void updateData() throws IOException {
        File database = new File("D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);
        File tempDB = new File("D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);
        System.out.println("List Buku");
        tampilkanData();
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan diupdate: ");
        int updateNum = terminalInput.nextInt();
        int entryCounts = 0;
        String data = bufferedInput.readLine();
        while (data != null) {
            entryCounts++;

            StringTokenizer st = new StringTokenizer(data, ",");
            if (updateNum == entryCounts) {
                System.out.println("\nData yang ingin anda ubah adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + st.nextToken());
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());
                String[] fieldData = { "tahun", "penulis", "penerbit", "judul" };
                String[] tempData = new String[4];
                st = new StringTokenizer(data, ",");
                String originalData = st.nextToken();
                for (int i = 0; i < fieldData.length; i++) {
                    boolean isUpdate = getYesorNo("Apakah anda ingin mengubah " + fieldData[i]);
                    originalData = st.nextToken();
                    if (isUpdate) {
                        if (fieldData[i].equalsIgnoreCase("tahun")) {
                            System.out.print("masukan tahun terbit, format=(YYYY): ");
                            tempData[i] = ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukkan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine();

                        }
                    } else {
                        tempData[i] = originalData;
                        ;
                    }
                }
                st = new StringTokenizer(data, ",");
                st.nextToken();
                System.out.println("\nData baru anda adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Tahun           : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis         : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit        : " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul           : " + st.nextToken() + " --> " + tempData[3]);
                boolean isUpdate = getYesorNo("Apakah anda yakin ingin mengupdate data tersebut");
                if (isUpdate) {
                    boolean isExist = cekBukuDiDatabase(tempData, false);
                    if (isExist) {
                        System.out.println(
                                "data buku sudah ada di database, proses update dibatalkan, silahkan hapus data yang bersangkutan");
                        bufferedOutput.write(data);
                    } else {
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];
                        long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;
                        String punulisTanpaSpasi = penulis.replaceAll("\\s+", "");
                        String primaryKey = punulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
                        bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                    }
                } else {
                    bufferedOutput.write(data);
                }
            } else {
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }
        bufferedOutput.flush();
        bufferedInput.close();
        bufferedOutput.close();
        fileInput.close();
        fileOutput.close();
        database.delete();
        tempDB.renameTo(database);
    }

    private static void deleteData() throws IOException {
        File database = new File("D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);
        File tempDB = new File("D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);
        System.out.println("List Buku");
        tampilkanData();
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();
        boolean isFound = false;
        int entryCounts = 0;
        String data = bufferedInput.readLine();
        while (data != null) {
            entryCounts++;
            boolean isDelete = false;
            StringTokenizer st = new StringTokenizer(data, ",");
            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + st.nextToken());
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());
                isDelete = getYesorNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }
            if (isDelete) {
                System.out.println("Data Berhasil Dihapus");
            } else {
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }
        if (!isFound) {
            System.out.println("Data tidak ditemukan");
        }
        bufferedOutput.flush();
        bufferedInput.close();
        bufferedOutput.close();
        fileInput.close();
        fileOutput.close();
        database.delete();
        tempDB.renameTo(database);
    }

    private static void tambahData() throws IOException {
        FileWriter fileOutput = new FileWriter(
                "D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\database.txt", true);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);
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
                bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferedOutput.newLine();
                bufferedOutput.flush();
                bufferedOutput.close();
            }
        } else {
            System.out.println("buku yang anda akan masukan sudah tersedia di database dengan data berikut:");
            cekBukuDiDatabase(keywords, true);
        }
    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader(
                "D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);
        long entry = 0;
        String data = bufferedInput.readLine();
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
            data = bufferedInput.readLine();
        }
        fileInput.close();
        bufferedInput.close();
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
            File file = new File("D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\database.txt");
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
                "D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);
        String data = bufferedInput.readLine();
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
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");
                    stringToken.nextToken();
                    System.out.printf("| %2d ", nomorData);
                    System.out.printf("|\t%4s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%s   ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }
            data = bufferedInput.readLine();

        }
        if (isDisplay) {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
        }
        bufferedInput.close();
        return isExist;
    }

    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferedInput;
        try {
            fileInput = new FileReader(
                    "D:\\Pemograman\\Java\\65. Project CRUD Update Data\\src\\com\\program\\database.txt");
            bufferedInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        String data = bufferedInput.readLine();
        int nomorData = 0;
        while (data != null) {
            nomorData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%s   ", stringToken.nextToken());
            System.out.print("\n");
            data = bufferedInput.readLine();
        }
        bufferedInput.close();
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
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
