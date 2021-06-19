package com.tutorial;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double rataNilai, nilaiRemidi, jumlahNilai;
        double nilaiIPA, nilaiMTK, nilaiBHS;

        System.out.println("=== Program Penghitung Nilai Ulangan ===");

        System.out.println("Masukkan Nilai Mata Pelajaran IPA");
        nilaiIPA = userInput.nextDouble();
        System.out.println("Masukkan Nilai Mata Pelajaran MTK");
        nilaiMTK = userInput.nextDouble();
        System.out.println("Masukkan Nilai Mata Pelajaran Bahasa");
        nilaiBHS = userInput.nextDouble();

        if (nilaiIPA >= 90) {
            System.out.printf("\nNilai Mata Pelajaran IPA anda %s dengan predikat 'A'\n", nilaiIPA);
        } else if (nilaiIPA >= 75) {
            System.out.printf("\nNilai Mata Pelajaran IPA anda %s dengan predikat 'B'\n", nilaiIPA);
        } else {
            System.out.println("\nAnda harus mengikuti remidi dalam Mata Pelajaran IPA");
            System.out.println("Masukkan nilai remidi untuk mata pelajaran IPA = ");

            nilaiRemidi = userInput.nextDouble();
            nilaiIPA = (nilaiRemidi + nilaiIPA) / 2;

            if (nilaiIPA >= 70) {
                System.out.printf("Anda telah lulus remidi mata pelajaran IPA dengan rata-rata nilai %s predikat 'C'\n",
                        nilaiIPA);
            } else {
                System.out.println("Maaf, anda tidak lulus dalam mata pelajaran IPA");
            }
        }

        if (nilaiMTK >= 90) {
            System.out.printf("\nNilai Mata Pelajaran MTK anda %s dengan predikat 'A'\n", nilaiMTK);
        } else if (nilaiMTK >= 75) {
            System.out.printf("\nNilai Mata Pelajaran MTK anda %s dengan predikat 'B'\n", nilaiMTK);
        } else {
            System.out.println("\nAnda harus mengikuti remidi dalam Mata Pelajaran MTK");
            System.out.println("Masukkan nilai remidi untuk mata pelajaran MTK = ");

            nilaiRemidi = userInput.nextDouble();
            nilaiMTK = (nilaiRemidi + nilaiMTK) / 2;

            if (nilaiMTK >= 70) {
                System.out.printf("Anda telah lulus remidi mata pelajaran MTK dengan rata-rata nilai %s predikat 'C'\n",
                        nilaiMTK);
            } else {
                System.out.println("Maaf, anda tidak lulus dalam mata pelajaran MTK");
            }
        }

        if (nilaiBHS >= 90) {
            System.out.printf("\nNilai Mata Pelajaran Bahasa anda %s dengan predikat 'A'\n", nilaiBHS);
        } else if (nilaiBHS >= 75) {
            System.out.printf("\nNilai Mata Pelajaran Bahasa anda %s dengan predikat 'B'\n", nilaiBHS);
        } else {
            System.out.println("\nAnda harus mengikuti remidi dalam Mata Pelajaran Bahasa");
            System.out.println("Masukkan nilai remidi untuk mata pelajaran Bahasa = ");

            nilaiRemidi = userInput.nextDouble();
            userInput.close();
            nilaiBHS = (nilaiRemidi + nilaiBHS) / 2;

            if (nilaiBHS >= 70) {
                System.out.printf(
                        "Anda telah lulus remidi mata pelajaran Bahasa dengan rata-rata nilai %s predikat 'C'\n",
                        nilaiBHS);
            } else {
                System.out.println("Maaf, anda tidak lulus dalam mata pelajaran Bahasa");
            }
        }

        jumlahNilai = nilaiIPA + nilaiMTK + nilaiBHS;
        rataNilai = jumlahNilai / 3;

        System.out.printf("\nJumlah total semua nilai anda = %s dengan nilai rata - rata %f ", jumlahNilai, rataNilai);

        if (rataNilai >= 90) {
            System.out.println("\nSelamat anda telah lulus dengan predikat 'A'");
        } else if (rataNilai >= 80) {
            System.out.println("\nSelamat anda telah lulus dengan predikat 'B'");
        } else if (rataNilai >= 70) {
            System.out.println("\nSelamat anda telah lulus dengan predikat 'C'");
        } else if (rataNilai >= 60) {
            System.out.println("\nSelamat anda telah lulus dengan predikat 'D'");
        } else {
            System.out.println("\nMaaf anda tidak lulus");
        }
    }
}