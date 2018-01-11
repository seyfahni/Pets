package de.seyfarth.tutorium.encryption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner commandLine = new Scanner(System.in)) {
            System.out.println("Enter Key: ");
            String keyRepresentant = commandLine.nextLine();
            System.out.println("Enter Messsage: ");
            String message = commandLine.nextLine();
            Cipher cipher = new CaesarCipher();
            Key key = cipher.getKey(keyRepresentant);
            System.out.println("Encrypted message: " + cipher.encrypt(key, message));
        }
    }
}
