package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        input = inputUser.nextInt();
        inputUser.close();

        // variabel x = ekspresi ? statement_true : statement_false

        x = (input == 10) ? (input * input) : (input / 2);

        // Jika memakai if
        // if (input == 10){
        // x = input*input;
        // } else (
        // x = input/2;
        // )
        // jadi ternary itu shorthand dari if statement dan dia satu baris untuk
        // menyingkat aja
        // kalo terlalu kompleks mending pake if else

        System.out.println("hasilnya " + x);

    }
}
