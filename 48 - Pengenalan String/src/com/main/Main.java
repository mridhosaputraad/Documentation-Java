package com.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Membuat string
        String kataString = "Hello World";
        char[] kataChar = { 'h', 'e', 'l', 'l', 'o' };

        // Menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // Mengakses komponen string
        System.out.println("Komponen n dari char[] = " + kataChar[2]);
        System.out.println("Komponen n dari string = " + kataString.charAt(2));

        // Mengubah komponen dari String
        // Itu tidak bisa, karena string di java itu imutable
        kataChar[0] = 'c';
        System.err.println(Arrays.toString(kataChar));
        // kataString[0] ="c"; ---> tidak bisa
        // kataString.charAt(0) = "c"; ---> tidak bisa

        // Kita bisa mengubah komponen secara tidak langsung
        kataString = "C" + kataString.substring(1, 5);
        System.out.println(kataString);

        System.out.println(kataString);

        printAddress("kataString", kataString);

        // memory dari string (String Pool)

        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";

        printAddress("str_1", str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);

        str_3 = str_3.substring(0, 4);
        printAddress("str_3", str_3);

        String str_4 = "callo";
        printAddress("str_4", str_4);

        kataString = "callo";
        printAddress("kataString", kataString);

        // 1. String di java itu immutable
        // 2. String yang berada di string pool itu akan reuseable, memorynya lebih
        // efisien
        // 3. membuat string dengan method baru, maka dia akan ditaro di memory lain
        // bukan di string pool

        // liat lebih dalam

        String a = new String("hallo");
        printAddress("a", a);

    }

    private static void printAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + "\t|| address = " + Integer.toHexString(address));
    }
}
