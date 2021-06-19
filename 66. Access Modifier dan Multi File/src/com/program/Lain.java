package com.program;

public class Lain {
    // bagian isidapat diakses oleh siapa pun
    public static void methodPublic() {
        System.out.println("public");
        methodPrivate();
    }

    // ini hanya dapat diakses oleh class yang bersangkutan
    private static void methodPrivate() {
        System.out.println("private");
    }

    // ini hanya dapat diakses oleh class dalam package yang sama
    static void methodDefault() {
        System.out.println("default");
    }

    // ini hanya dapat diakses oeh class dalam package yang sama
    // dan subclass
    protected static void methodProtected() {
        System.out.println("protected");
    }
}
