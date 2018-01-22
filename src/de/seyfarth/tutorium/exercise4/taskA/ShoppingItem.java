package de.seyfarth.tutorium.exercise4.taskA;

public class ShoppingItem {
	
	private final String name;
	private final int id;
	private final Price pricePerItem;

	public ShoppingItem(String name, int id, Price pricePerItem) {
		if (name == null || pricePerItem == null) {
			throw new NullPointerException();
		}

		this.name = name;
		this.id = id;
		this.pricePerItem = pricePerItem;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Price getPricePerItem() {
		return pricePerItem;
	}

	@Override
	public String toString() {
		return name + "," + id + "," + pricePerItem;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17 * hash + this.name.hashCode();
		hash = 17 * hash + this.id;
		hash = 17 * hash + this.pricePerItem.hashCode();
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
		final ShoppingItem other = (ShoppingItem) obj;
		if (this.id != other.id) {
			return false;
		}
		if (!this.name.equals(other.name)) {
			return false;
		}
		if (!this.pricePerItem.equals(other.pricePerItem)) {
			return false;
		}
		return true;
	}
}
