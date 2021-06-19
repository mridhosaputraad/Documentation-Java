package com.Main;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";

        // Mengambil kommponen pada string
        System.out.println(kalimat.charAt(5));

        // Substring
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);

        // Conatenation
        String Kalimat2 = kata + " bakwan";
        System.out.println(Kalimat2);

        kata = kata + " cireng";
        System.out.println(kata);

        // concat dengan new string
        int jumlah = 22;
        String kalimat3 = kata + " " + jumlah; // casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("pisang", "combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // compare
        String motor1 = "bakwan";
        String motor2 = "bala-bala";
        System.out.println(motor1.compareTo(motor2));

        // equality ( persamaan )
        String kataInput = "test"; // ini ada di string pool
        // String kataInput = new String("test"); // ini bukan string literal, dan tidak
        // berada di string pool
        String kataTest = "test"; // ini ada di string pool

        System.out.println("\npersamaan lokasi pada string pool");
        if (kataInput == kataTest) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("\nmengambil input string dari user: ");
        kataInput = userInput.next(); // tidak di string pool
        System.out.println("ini adalah input user: " + kataInput);

        if (kataInput.equals(kataTest)) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
    }
}
