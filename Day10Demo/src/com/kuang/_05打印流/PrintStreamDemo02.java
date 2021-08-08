package com.kuang._05打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo02 {
    public static void main(String[] args) throws Exception {
        PrintStream printStream = new PrintStream("Day10Demo/src/log");
        System.setOut(printStream);

        System.out.println("===xxxxx===");
        System.out.println("===12345===");
        System.out.println("===zczv===");
        System.out.println("===ajkk===");
    }
}
