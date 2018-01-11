package de.seyfarth.tutorium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner commandLine = new Scanner(System.in)) {
            String input = commandLine.nextLine();
            System.out.println("Input: " + input);
        }
    }
}
