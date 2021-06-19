package com.main;

public class Main {
    public static void main(String[] args) {
        // looping bersarang
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

                if ((i + j) == 8) {
                    break;
                }
            }
            System.out.print("\n");

        }

        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) >= 5) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i + j < 4) || (i - 5 == j) || (i - 6 == j) || (i - 7 == j) || (i - 8 == j)) {
                    System.out.print("  ");
                } else if ((j - 5 == i) || (i + j > 12)) {
                    break;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                if (i + j == 4) {
                    break;
                }

            }
            System.out.println("");
        }

    }
}
