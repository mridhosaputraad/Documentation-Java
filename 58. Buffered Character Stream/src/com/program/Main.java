package com.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Membaca file
        FileReader fileInput = new FileReader(
                "D:\\Pemograman\\Java\\58. Buffered Character Stream\\src\\com\\program\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);
        // Membaca kedalam string
        String data = bufferedReader.readLine();
        System.out.println(data);

        // Membaca ke dalam char
        bufferedReader.reset();
        char[] dataChar = new char[25];
        bufferedReader.read(dataChar, 0, 25);
        System.out.println(Arrays.toString(dataChar));

        // membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // Menulis file
        FileWriter fileOutput = new FileWriter(
                "D:\\Pemograman\\Java\\58. Buffered Character Stream\\src\\com\\program\\output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();

        bufferedWriter.write(baris1, 0, baris1.length());
        bufferedWriter.flush();

        // Menambah new line, enter
        bufferedWriter.newLine();

        String baris2 = bufferedReader.readLine();
        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();

    }
}
