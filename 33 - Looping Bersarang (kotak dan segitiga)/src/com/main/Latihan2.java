package com.main;

import java.util.*;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        int nilai, a, b, c, d, e;

        a = 1;
        b = 1;

        System.out.println("\n- - - Belajar looping bersarang - - -");
        System.out.println("- - - Membuat Kotak - - -");
        System.out.println("Input Jumlah Bintang : ");
        nilai = input.nextInt();
        while (a <= nilai) {
            System.out.printf("loop ke - " + a + " ");
            while (b <= nilai) {
                System.out.printf("* ");
                b++;
            }
            b = 1;
            a++;
            System.out.println("");
        }

        a = 1;
        b = 1;

        System.out.println("\n- - - Membuat segitiga - - -\n(Tinggi di kiri dan alas di bawah)");
        System.out.println("Input Jumlah tinggi : ");
        nilai = input.nextInt();
        while (a <= nilai) {
            System.out.printf("loop ke - " + a + " ");
            while (b <= nilai) {
                System.out.printf("* ");
                if (a == b) {
                    break;
                }
                b++;
            }
            b = 1;
            a++;
            System.out.println("");
        }
        a = 1;
        b = 1;

        System.out.println("\n- - - Membuat segitiga - - -\n(Tinggi di kiri dan alas di atas)");
        System.out.println("Input Jumlah Bintang : ");
        nilai = input.nextInt();
        while (a <= nilai) {
            System.out.printf("loop ke - " + a + " ");
            while (b <= nilai) {
                System.out.printf("* ");
                if ((a + b) == (nilai + 1)) {
                    break;
                }
                b++;
            }
            b = 1;
            a++;
            System.out.println("");
        }
        a = 1;
        b = 1;

        System.out.println("\n- - - Membuat segitiga - - - \n(Sama Sisi dan alas di kiri)");
        System.out.println("Input tinggi Bintang : ");
        nilai = input.nextInt();
        while (a <= (nilai - 1) * 2 + 1) {
            System.out.printf("loop ke - " + a + " ");
            while (b <= (nilai - 1) * 2 + 1) {
                System.out.printf("* ");
                if (a == b) {
                    break;
                } else if ((a + b) == (nilai - 1) * 2 + 2) {
                    break;
                }
                b++;
            }
            b = 1;
            a++;
            System.out.println("");
        }

        a = 1;
        b = 1;
        c = 1;

        System.out.println("\n- - -Tugas Membuat segitiga - - - \n(tinggi di kanan dan alas di bawah)");
        System.out.println("Input Jumlah Bintang : ");
        nilai = input.nextInt();
        while (a <= nilai) {
            System.out.printf("loop ke - " + a + " ");
            while (c <= nilai - a) {
                System.out.printf("  ");
                c++;
            }
            while (b <= nilai) {
                System.out.printf("* ");
                if (a == b) {
                    break;
                }
                b++;
            }
            b = 1;
            c = 1;
            a++;
            System.out.println("");
        }
        a = 1;
        b = 1;
        c = 1;

        System.out.println("\n- - - Tugas Membuat segitiga - - - \n(tinggi di kanan dan alas di atas)");
        System.out.println("Input Jumlah Bintang : ");
        nilai = input.nextInt();
        while (a <= nilai) {
            System.out.printf("loop ke - " + a + " ");
            //
            while (b <= nilai) {
                if (b == a) {
                    break;
                }
                System.out.printf("  ");
                b++;
            }
            //
            while (c <= nilai) {
                System.out.printf("* ");
                if (a + c == nilai + 1) {
                    break;
                }
                c++;
            }
            //
            a++;
            b = 1;
            c = 1;
            System.out.println("");
        }
        a = 1;
        b = 1;
        c = 1;
        d = 1;

        System.out.println("\n- - - Tugas Membuat lupis - - -");
        System.out.println("Input panjang setengah diagonal : ");
        nilai = input.nextInt();
        while (a <= (nilai * 2) - 1) {
            System.out.printf("loop ke - " + a + " ");
            //// kuning
            if (a <= nilai) {
                while (c <= nilai - a) {
                    System.out.printf("  ");
                    c++;
                }
                while (b <= nilai) {
                    System.out.printf("* ");
                    if (a == b) {
                        break;
                    }
                    b++;
                }
                //// biru
                while (d <= nilai) {
                    if (d == a) {
                        break;
                    }
                    System.out.printf("* ");
                    if (a == d - 1) {
                        break;
                    }
                    d++;
                }
            }
            if (a > nilai) {
                //// hijau
                while (c <= nilai) {
                    if (c == a - nilai + 1) {
                        break;
                    }
                    System.out.printf("  ");
                    c++;
                }
                while (b <= nilai) {
                    System.out.printf("* ");
                    if (a + b == nilai + 5) {
                        break;
                    }
                    b++;
                }
                /// merah
                while (d <= nilai) {
                    if (a == 9) {
                        break;
                    }
                    System.out.printf("* ");
                    if (a + d == 9) {
                        break;
                    }
                    d++;
                }
            }
            a++;
            b = 1;
            c = 1;
            d = 1;
            System.out.println("");
        }
    }
}
