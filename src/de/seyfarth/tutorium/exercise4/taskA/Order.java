package de.seyfarth.tutorium.exercise4.taskA;

public class Order {
	
	private final int id;
	private final Customer customer;
	private final ShoppingItem item;
	private final int amount;
	private final Price totalPrice;

	public Order(int id, Customer customer, ShoppingItem item, int amount) {
		if (customer == null || item == null) {
			throw new NullPointerException();
		}
		
		this.id = id;
		this.customer = customer;
		this.item = item;
		this.amount = amount;
		totalPrice = item.getPricePerItem().multiply(amount);
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public ShoppingItem getItem() {
		return item;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return id + "," + customer.getId() + "," + amount + "," + item + "," + totalPrice;
	}
}
