package de.seyfarth.tutorium.exercise4.taskA;

import edu.kit.informatik.Terminal;

public class Main {

	public static void main(String[] args) {
		boolean running = true;
		Shop shop = new Shop();
		do {
			String[] input = Terminal.readLine().split(" ", 2);
			String command = input[0];
			String[] arguments;
			if (input.length == 2) {
				arguments = input[1].split(";");
			} else {
				arguments = new String[0];
			}

			try {
				switch (command) {
					case "add-customer":
						requireArgumentCount(arguments.length, 3);
						shop.addCustomer(arguments[0], arguments[1], arguments[2]);
						Terminal.printLine("OK");
						break;
					case "add-shoppingitem":
						requireArgumentCount(arguments.length, 3);
						shop.addShoppingItem(arguments[0], arguments[1], arguments[2]);
						Terminal.printLine("OK");
						break;
					case "order":
						requireArgumentCount(arguments.length, 4);
						shop.addOrder(arguments[0], arguments[1], arguments[2], arguments[3]);
						Terminal.printLine("OK");
						break;
					case "print":
						requireArgumentCount(arguments.length, 1);
						Order order = shop.getOrder(arguments[0]);
						Terminal.printLine("(" + order + ")");
						break;
					case "quit":
						requireArgumentCount(arguments.length, 0);
						running = false;
						break;
					default:
						throw new ShopException("'" + command + "' is not a valid command.");
				}
			} catch (ShopException ex) {
				Terminal.printError(ex.getMessage());
			}
		} while (running);
	}
	
	private static void requireArgumentCount(int actual, int required) throws ShopException {
		if (actual != required) {
			throw new ShopException(required + " arguments required.");
		}
	}
}
