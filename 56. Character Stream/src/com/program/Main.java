package com.program;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Membuka file
        // byte stream -> FIleInputStream
        // Character Stream -> Filereader

        FileInputStream byteFileInput = new FileInputStream(
                "D:\\Pemograman\\Java\\56. Character Stream\\src\\com\\program\\input.txt");
        FileReader charFileInput = new FileReader(
                "D:\\Pemograman\\Java\\56. Character Stream\\src\\com\\program\\input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream(
                "D:\\Pemograman\\Java\\56. Character Stream\\src\\com\\program\\outputByte.txt");

        FileWriter charFileOutput = new FileWriter(
                "D:\\Pemograman\\Java\\56. Character Stream\\src\\com\\program\\outputChar.txt");

        // Membaca file

        // byte file
        int buffer = byteFileInput.read();

        while (buffer != -1) {
            System.out.print((char) buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");

        // char file
        buffer = charFileInput.read();

        while (buffer != -1) {
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // Menutup file
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
    }
}
