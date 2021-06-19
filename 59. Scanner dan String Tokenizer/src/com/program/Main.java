package com.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileInput = new FileReader(
                "D:\\Pemograman\\Java\\59. Scanner dan String Tokenizer\\src\\com\\program\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // Untuk membaca kata dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.hasNext());

        // Menggunakan delimeter tertentu
        FileReader fileInput2 = new FileReader(
                "D:\\Pemograman\\Java\\59. Scanner dan String Tokenizer\\src\\com\\program\\input2.txt");
        bufferedReader = new BufferedReader(fileInput2);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // Menggunakan string tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new stringTokenizer(data, ",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }

        // baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new stringTokenizer(data, ",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }

    }
}
