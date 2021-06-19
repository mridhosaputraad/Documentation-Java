package com.main;

public class Main {
    public static void main(String[] args) {
        int hasilInteger;
        hasilInteger = tambah(2, 4);
        printAngka(hasilInteger);

        float hasilFloat;

        hasilFloat = tambah(4.5f, 2);
        printAngka(hasilFloat);
    }

    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3) {
        return angkaInt1 + angkaInt2 + angkaInt3;

    }

    private static float tambah(int angkaInt, float angkaFloat) {
        return angkaInt + angkaFloat;
    }

    private static float tambah(float angkaFloat, int angkaInt) {
        return angkaFloat + angkaInt;
    }

    private static int tambah(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(float angkaFloat) {
        System.out.println("ini adalah Float dengan nilai = " + angkaFloat);
    }

    private static void printAngka(float angkaFloat) {
        System.out.println("ini adalah Float dengan nilai = " + angkaFloat);
    }

    private static void printAngka(int angkaInteger) {
        System.out.println("ini adalah integer dengan nilai = " + angkaInteger);
    }
}
