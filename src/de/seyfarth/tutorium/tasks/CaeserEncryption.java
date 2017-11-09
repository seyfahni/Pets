package de.seyfarth.tutorium.tasks;

public class CaeserEncryption {

	public static void main(String[] args) {
		System.out.println("Simple caesar encryption:\nMessage: Caesar\nDelta: 5\nEncrypted: " + caesarEncryptSimple("Caesar", 5));
		System.out.println();
		
		System.out.println("Simple caesar encryption:\nMessage: myNr=4\nDelta: 9\nEncrypted: " + caesarEncryptSimple("myNr=4", 9));
		System.out.println();
		
		System.out.println("Improved caesar encryption:\nMessage Caesar\nDelta: 5\nEncrypted: " + caesarEncrypt("Caesar", 5));
		System.out.println();
		
		System.out.println("Improved caesar encryption:\nMessage myNr=4\nDelta: 9\nEncrypted: " + caesarEncrypt("myNr=4", 9));
		System.out.println();
	}
	
	public static String caesarEncryptSimple(String message, int delta) {
		String encrypted = "";
		encrypted += (char) (message.charAt(0) + delta);
		encrypted += (char) (message.charAt(1) + delta);
		encrypted += (char) (message.charAt(2) + delta);
		encrypted += (char) (message.charAt(3) + delta);
		encrypted += (char) (message.charAt(4) + delta);
		encrypted += (char) (message.charAt(5) + delta);
		return encrypted;
	}
	
	public static String caesarEncrypt(String message, int delta) {
		StringBuilder encrypted = new StringBuilder(message.length());
		for (int index = 0; index < message.length(); index++) {
			encrypted.append(caesarEncryptChar(message.charAt(index), delta));
		}
		return encrypted.toString();
	}
	
	public static char caesarEncryptChar(char letter, int delta) {
		if (letter >= '0' && letter <= '9') {
			return (char) ((letter - '0' + delta) % 10 + '0');
		} else if (letter >= 'A' && letter <= 'Z') {
			return (char) ((letter - 'A' + delta) % 26 + 'A');
		} else if (letter >= 'a' && letter <= 'z') {
			return (char) ((letter - 'a' + delta) % 26 + 'a');
		} else {
			return letter;
		}
	}
}
