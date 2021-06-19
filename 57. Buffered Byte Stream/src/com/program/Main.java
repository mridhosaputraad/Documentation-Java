package com.program;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long waktuStart, waktuFinish;

        // Membuka dari file
        FileInputStream byteInput = new FileInputStream(
                "D:\\Pemograman\\Java\\57. Buffered Byte Stream\\src\\com\\program\\input.txt");
        System.out.println(byteInput.available());

        // menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu " + (waktuFinish - waktuStart));
        byteInput.close();

        // Membaca dari memory
        FileInputStream byteInput2 = new FileInputStream(
                "D:\\Pemograman\\Java\\57. Buffered Byte Stream\\src\\com\\program\\input2.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu " + (waktuFinish - waktuStart));

        // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);

        // Menulis dengan buffered output
        FileOutputStream byteOutputStream = new FileOutputStream(
                "D:\\Pemograman\\Java\\57. Buffered Byte Stream\\src\\com\\program\\output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutputStream);

        // write data berupa byte
        bufferedOutput.write(data, 0, data.length);
        bufferedOutput.flush();
    }
}
