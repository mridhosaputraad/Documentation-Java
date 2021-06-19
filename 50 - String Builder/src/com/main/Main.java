package com.main;

import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Halo");
        printData(builder);

        // append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga palembang");
        printData(builder);

        // insert
        builder.insert(19, " kota");
        printData(builder);

        // delete
        builder.delete(19, 24);
        printData(builder);

        // ubah karakter pada index tertentu
        builder.setCharAt(14, 'W');
        printData(builder);

        // replace
        builder.replace(20, 28, "Bandung");
        printData(builder);

        // Casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressStrinng = System.identityHashCode(kalimat);
        System.out.println("address " + Integer.toHexString(addressStrinng));

    }

    private static void printData(StringBuilder dataBuilder) {
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toString(addressBuilder));

    }
}
