package com.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka1 = { 1, 2, 3, 4, 5 }; // array literal
        int[] arrayAngka2 = new int[5]; //

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1;

        ubahArray(arrayAngka1);
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));

    }
    // method yang argumenny adalah reference, by pass reference
    // bukan pass by value

    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }
}
