package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // operator komparasi...ini akan menghasilkan nilai dalam bentuk boolean

        int a, b;
        boolean hasilKomparasi;

        // Operator equal atau persamaan
        System.out.println("====PERSAMAAN====");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == $d ---> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ---> %s \n", a, b, hasilKomparasi);

        // Operator not equal atau pertidaksamaan
        System.out.println("====PERTIDAKSAMAAN====");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n", a, b, hasilKomparasi);

        // Operator less then atau kurang dari
        System.out.println("====KURANG DARI====");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n", a, b, hasilKomparasi);

        // Operator greater then atau lebih dari
        System.out.println("====LEBIH DARI====");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n", a, b, hasilKomparasi);

        // Operator less then equal atau kurang dari sama dengan
        System.out.println("====KURANG DARI SAMA DENGAN====");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n", a, b, hasilKomparasi);

        // Operator greater then equal atau lebih dari sama dengan
        System.out.println("====LEBIH DARI SAMA DENGAN====");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n", a, b, hasilKomparasi);
    }
}
