package com.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();
        inputUser.close();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        // for (int i = 1; i <= n; i++) {
        // System.out.println("nilai ke = " + i + " adalah " + f_n);
        // f_n = f_n_1 + f_n_2;
        // f_n_2 = f_n_1;
        // f_n_1 = f_n;
        // }

        int i = 1;

        // do {
        // System.out.println("nilai ke = " + i + " adalah " + f_n);
        // f_n = f_n_1 + f_n_2;
        // f_n_2 = f_n_1;
        // f_n_1 = f_n;
        // i++;
        // } while (i <= n);

        while (i <= n) {
            System.out.println("nilai ke = " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }

    }
}
