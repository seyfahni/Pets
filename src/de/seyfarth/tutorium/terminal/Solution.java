package de.seyfarth.tutorium.terminal;

import edu.kit.informatik.Terminal;
import java.util.Locale;

public class Solution {

	public static void main(String[] args) {
		String input = Terminal.readLine();
		if (input.matches("[a-z0-9]+")) {
			Terminal.printLine(input.toUpperCase(Locale.ROOT));
		} else {
			Terminal.printError("input '" + input + "' doesn't consist only of lower-case letters and/or numbers.");
		}
	}
}
