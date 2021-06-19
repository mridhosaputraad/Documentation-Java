package com.main;

import java.util.*;

public class Latihan3 {

    double harga, total, bayar, kembalian;
    int pil, jumlah;

    double hitungTotal(int jml) {
        jumlah = jml;
        switch (pil) {
            case 0:
                System.exit(0);
                break;
            case 1:
                harga = 10000;
                total = total + (harga * jml);
                break;
            case 2:
                harga = 12000;
                total = total + (harga * jml);
                break;
            case 3:
                harga = 18000;
                total = total + (harga * jml);
                break;
            case 9:
                break;
            default:
                System.out.println("ERROR: Input yang anda masukkan salah !");
                break;
        }
        return total;
    }

    void viewTotal() {
        System.out.println("==========|PEMBAYARAN|==========");
        System.out.println("Total: Rp." + total);
    }

    double hitungKembalian(double byr) {
        bayar = byr;
        kembalian = byr - total;
        return kembalian;
    }

    void viewKembalian() {
        System.out.println("Kembalian: Rp." + kembalian);
        System.out.println("==========|TERIMA KASIH|==========");
    }

    public static void main(String[] args) {
        /*
         * -> Menentukan class-class: 1. Menghitung biaya total 2. Menampilkan biaya
         * total 3. Menghitung kembalian yang dikurangi dai harga total dengan uang yang
         * dibayarkan 4. Menampilkan kembalian 5. class main untuk input maupun output
         * program
         * 
         */

        Scanner input = new Scanner(System.in);
        Latihan3 in = new Latihan3();
        System.out.println("============================");
        System.out.println("KEDAI THAI TEA SUKSES SELALU");
        do {
            System.out.println("============================");
            System.out.println("Menu: ");
            System.out.println("1. Thai Tea Original (Rp. 10.000)");
            System.out.println("2. MIlo Thai Tea (Rp. 12.000)");
            System.out.println("3. Green Tea Thai Tea (Rp. 18.000)");
            System.out.println("\n9. Selesai dan hitung pembayaran");
            System.out.println("0. Keluar program");
            System.out.println("============================");
            System.out.println("Masukkan Pilihan: ");
            in.pil = input.nextInt();
            if (in.pil >= 1 && in.pil <= 3) {
                System.out.println("Masukkan Jumlah Beli: ");
                in.jumlah = input.nextInt();
            } else {
            }
            in.hitungTotal(in.jumlah);
        } while (in.pil != 9);
        in.viewTotal();
        System.out.print("Bayar: Rp.");
        in.bayar = input.nextDouble();
        in.hitungKembalian(in.bayar);
        in.viewKembalian();
    }
}
