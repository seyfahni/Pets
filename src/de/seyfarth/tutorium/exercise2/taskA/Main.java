package de.seyfarth.tutorium.exercise2.taskA;

public final class Main {

	public static void main(String[] args) {
		System.out.println(product(6, 11));
		System.out.println(formatIntArray(countdown(5, 0)));
		System.out.println(formatIntArray(numberSequence(1, 14)));
		System.out.println(CarInsurance.calculateInsurance(3, 3000));
	}

	public static String formatIntArray(int[] array) {
		String[] output = intArrayToStringArray(array);
		return String.join(" ", output);
	}

	private static String[] intArrayToStringArray(int[] array) {
		String[] output = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			output[i] = String.valueOf(array[i]);
		}
		return output;
	}

	public static int product(int minimum, int maximum) {
		int product = maximum;
		for (int current = minimum; current < maximum; current++) {
			product *= current;
		}
		return product;
	}

	public static int[] countdown(int start, int end) {
		int[] countdown = new int[start - end + 1];
		for (int index = 0; index < countdown.length; index++) {
			countdown[index] = start - index;
		}
		return countdown;
	}

	public static int[] numberSequence(int start, int end) {
		int[] sequence = new int[(end + 1) / 2 - start / 2];
		int odd = start | 1;
		for (int index = 0; index < sequence.length; index++) {
			sequence[index] = odd;
			odd += 2;
		}
		return sequence;
	}

	private Main() {
	}
}
