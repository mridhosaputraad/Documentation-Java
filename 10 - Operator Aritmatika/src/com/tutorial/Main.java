package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int variabel1 = 11;
        int variabel2 = 5;

        int hasil;

        // 1. penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        // 2. pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d + %d = %d \n", variabel1, variabel2, hasil);

        // 3. perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n", variabel1, variabel2, hasil);

        // 4. pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n", variabel1, variabel2, hasil);

        float a = 6f;
        float b = 5f;
        float hasilfloat = a / b;
        System.out.println(a + " / " + b + " = " + hasilfloat);

        // 5. modulus
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n", variabel1, variabel2, hasil);

    }
}
