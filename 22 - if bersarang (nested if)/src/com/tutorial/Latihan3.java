package com.tutorial;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int answer;
        int skor = 0;

        System.out.println("====== QUIZ PENGETAHUAN UMUM ======\n");
        System.out.println("Jawab pertanyaan di bawah ini dengan 2 pilihan betul atau salah.\n"
                + "Jika betul ketikkan '1' jika salah '0' lalu Enter.\n"
                + "Jawaban benar skor +10, jawaban salah skor -10\n");

        // No.1 //jawabannya 0
        System.out.print("1. Paris adalah ibukota Perancis.\n(betul='1' | salah='0')\nJawab = ");
        answer = userInput.nextInt();
        if (answer == 0) {
            skor += 10;
            System.out.printf("\nJawaban Anda Benar! Skor saat ini: %d\n\n", skor);
        } else if (answer == 1) {
            skor -= 10;
            if (skor < 0) {
                skor = 0;
            }
            System.out.printf("\nJawaban Anda Salah! Skor saat ini: %d\n\n", skor);
        } else {
            System.out.println("Mohon masukkan antara '1' atau '0'\n");
        }

        // No.2 //jawabannya 1
        System.out.print("2. Rumput yang paling cepat tumbuh adalah Bambu.\n(betul='1' | salah='0')\nJawab = ");
        answer = userInput.nextInt();
        userInput.close();
        if (answer == 1) {
            skor += 10;
            System.out.printf("\nJawaban Anda Benar! Skor saat ini: %d", skor);
        } else if (answer == 0) {
            skor -= 10;
            if (skor < 0) {
                skor = 0;
            }
            System.out.printf("\nJawaban Anda Salah! Skor saat ini: %d", skor);
        } else {
            System.out.println("Mohon masukkan antara '1' atau '0'\n");
        }
    }
}
