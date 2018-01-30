package de.seyfarth.tutorium.exercise4.taskA;

public class Price extends Number {

	private final int value;

	public Price(double price) {
		this.value = (int) (price * 100);
	}
	
	public Price(int full, int hundredth) {
		if (hundredth < 0 || hundredth >= 100) {
			throw new IllegalArgumentException(String.valueOf(hundredth));
		}
		this.value = full * 100 + hundredth;
	}
	
	private Price(int price) {
		this.value = price;
	}
	
	public static Price parsePrice(String price) {
		// Could be solved much more fancy with java.util.regex but isn't allowed for this task. 
		if (price != null && price.matches("\\d+(.\\d{2})?")) {
			String[] part = price.split("\\.");
			int priceValue = Integer.parseInt(part[0]) * 100;
			if (part.length == 2) {
				priceValue += Integer.parseInt(part[1]);
			}
			return new Price(priceValue);
		} else {
			throw new IllegalArgumentException(price);
		}
	}
	
	public Price add(Price price) {
		return new Price(value + price.value);
	}

	public Price multiply(int amount) {
		return new Price(value * amount);
	}

	@Override
	public int intValue() {
		return value / 100;
	}

	@Override
	public long longValue() {
		return intValue();
	}

	@Override
	public float floatValue() {
		return value / 100.0f;
	}

	@Override
	public double doubleValue() {
		return value / 100.0;
	}

	@Override
	public String toString() {
		return String.valueOf(value / 100) + '.' + String.valueOf(value % 100);
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + this.value;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Price other = (Price) obj;
		if (this.value != other.value) {
			return false;
		}
		return true;
	}
}
