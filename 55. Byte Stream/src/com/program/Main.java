package com.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // Membuka File
        fileInput = new FileInputStream("D:\\Pemograman\\Java\\55. Byte
        Stream\\src\\com\\program\\input.txt");

        // Membaca filr
        int data = fileInput.read();
        while (data != -1) {
        System.out.println((char) data);
        data = fileInput.read();
        }

        // Menutup file
        fileInput.close();

        // Kasus
        try {
            // Membuka file
            fileInput = new FileInputStream("D:\\Pemograman\\Java\\55. Byte Stream\\src\\com\\program\\input.txt");
            fileOutput = new FileOutputStream("D:\\Pemograman\\Java\\55. Byte Stream\\src\\com\\program\\output.txt");

            // Membaca file
            int buffer = fileInput.read();

            // Menulis file
            while (buffer != -1) {
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }

        } finally {
            if (fileInput != null) {
                fileInput.close();
            }

            if (fileOutput != null) {
                fileOutput.close();
            }
        }

        // // Kasus (Try with resources) untuk sesuatu yang di close kita bisa taruh di
        // // trynya
        // try (FileInputStream in = new FileInputStream(
        //         "D:\\Pemograman\\Java\\55. Byte Stream\\src\\com\\program\\input.txt");
        //         FileOutputStream out = new FileOutputStream(
        //                 "D:\\Pemograman\\Java\\55. Byte Stream\\src\\com\\program\\output.txt")) {
        //     // Membaca filr
        //     int huruf = fileInput.read();
        //     while (huruf != -1) {
        //         out.write((char) huruf);
        //         huruf = fileInput.read();
        //     }
        // }
    }
}
