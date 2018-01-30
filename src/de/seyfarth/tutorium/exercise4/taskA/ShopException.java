package de.seyfarth.tutorium.exercise4.taskA;

/**
 * Indecates invalid handling of shop contents.
 */
public class ShopException extends Exception {

	/**
	 * Creates a new instance of <code>ShopException</code> without detail message.
	 */
	public ShopException() {
	}

	/**
	 * Constructs an instance of <code>ShopException</code> with the specified detail message.
	 *
	 * @param msg the detail message.
	 */
	public ShopException(String msg) {
		super(msg);
	}
}
