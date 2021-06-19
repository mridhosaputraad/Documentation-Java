package comm.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Contoh {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream inputFile = new FileInputStream('input.txt');

        System.out.println(inputFile.read());

    }
}
