package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Integer (satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("nilai Max = " + Integer.MAX_VALUE);
        System.out.println("nilai Min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");

        // BYTE (satuan)
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("nilai Byte b = " + b);
        System.out.println("nilai Max = " + Byte.MAX_VALUE);
        System.out.println("nilai Min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");

        // Short (satuan)
        short c = 10;
        System.out.println("=====SHORT=====");
        System.out.println("nilai Short c = " + c);
        System.out.println("nilai Max = " + Short.MAX_VALUE);
        System.out.println("nilai Min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Short = " + Short.SIZE + " bit");

        // Long (satuan)
        long d = 10L;
        System.out.println("=====LONG=====");
        System.out.println("nilai Long d = " + d);
        System.out.println("nilai Max = " + Long.MAX_VALUE);
        System.out.println("nilai Min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");

        // double (koma, bilangan ral)
        double e = -10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai Double e = " + e);
        System.out.println("nilai Max = " + Double.MAX_VALUE);
        System.out.println("nilai Min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");

        // float (koma, bilangan ral)
        float f = -10.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("nilai Float f = " + f);
        System.out.println("nilai Max = " + Float.MAX_VALUE);
        System.out.println("nilai Min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");

        // char (karakter berdasarkan ASCII)
        char g = 'G';
        System.out.println("=====CHARACTER=====");
        System.out.println("nilai char g = " + g);
        System.out.println("nilai Max = " + Character.MAX_VALUE);
        System.out.println("nilai Min = " + Character.MIN_VALUE);
        System.out.println("Besar Character = " + Character.BYTES + " bytes");

        // char (karakter berdasarkan ASCII)
        boolean val = false;
        System.out.println("=====BOOLEAN=====");
        System.out.println("nilai boolean = " + val);
        System.out.println("nilai Max = " + Boolean.TRUE);
        System.out.println("nilai Min = " + Boolean.FALSE);

    }
}
