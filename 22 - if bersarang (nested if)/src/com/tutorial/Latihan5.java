package com.tutorial;

import java.util.*;

public class Latihan5 {
    public static void main(String[] args) {

        Scanner inputdata = new Scanner(System.in);

        System.out.println("== Nilai Mata Pelajaran Kuliah Semester 1 ==");
        System.out.println(" ");
        System.out.print("Masukkan hasil nilai mata pelajaran = ");
        int nilai = inputdata.nextInt();

        if (nilai >= 85) {
            System.out.println("====> Nilai Anda A <====");
        } else if (nilai >= 70) {
            System.out.println("====> Nilai Anda B <====");
        } else if (nilai >= 60) {
            System.out.println("====> Nilai Anda C <====");
        } else if (nilai >= 50) {
            System.out.println("====> Nilai Anda D <====");
        } else {
            System.out.println("====> Remidi <====");
            System.out.println("------------------------------------------------");
            System.out.println("Bagi yang remidi silahkan hubungi dosen tertentu");
        }
    }
}
