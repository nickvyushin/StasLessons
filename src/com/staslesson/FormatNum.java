package com.staslesson;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FormatNum {

    public static void main(String[] args) throws IOException {

        /*var x = 1000.0 / 3.0;

        System.out.println(x);
        System.out.printf("%,.2f", 10000.0 / 3.0);*/

        /*Scanner in = new Scanner(Path.of("C:/Example.txt"), StandardCharsets.UTF_8);

        PrintWriter out = new PrintWriter("C:/Example.txt", StandardCharsets.UTF_8);

        out.println("Hi, I'm Nick!");*/


        //throw ex;

        try {
            pizda();
        } catch (RuntimeException e) {
            System.out.println("New exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception 2: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Finished");


    }

    public static void hui() {
        throw new RuntimeException("Wow!");
    }

    public static void pizda() throws Exception {
        throw new Exception("Help me!");
    }
}
