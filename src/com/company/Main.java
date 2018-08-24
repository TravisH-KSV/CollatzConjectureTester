package com.company;

import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        String[] arg = args;
        Console console = System.console();
        if (console != null) {
            console.printf("Console is working.%n");
        } else {
            System.out.println("This program needs to be run from the .jar with a console to work%n");
        }
        String testData = console.readLine("Enter any positive integer%n");
        BigInteger i = new BigInteger(testData);
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        int j = 0;
        while (i.compareTo(one)!=0) {
            console.printf(i + "%n");
            if ((i.mod(two)).equals(one)!=true) {
                i = i.divide(two);
            } else {
                i = i.multiply(three).add(one);
            }
            j++;
            //try {Thread.sleep(1);} catch (InterruptedException ex) {Thread.currentThread().interrupt();}
        }
        console.printf("Number hits zero on step #" + j + "%n%n");
        Main.main(arg);
    }
}
