package de.seyfarth.tutorium.exercise4.taskA;

public class Shop {
	
	private final SimpleArrayList<Customer> customers = new SimpleArrayList<>();
	private final SimpleArrayList<ShoppingItem> shoppingItems = new SimpleArrayList<>();
	private final SimpleArrayList<Order> orders = new SimpleArrayList<>();

	public Shop() {
	}
	
	public void addCustomer(String forename, String surname, String customerId) throws ShopException {
		if (forename == null || surname == null) {
			throw new ShopException("invalid name.");
		}
		checkId(customerId, "customer", 4);
		int id = Integer.parseInt(customerId);
		if (customers.anyMatch(customer -> customer != null && customer.getId() == id)) {
			throw new ShopException("id '" + customerId + "' is already taken.");
		}
		customers.add(new Customer(forename, surname, id));
	}
	
	public void addShoppingItem(String name, String itemId, String price) throws ShopException {
		if (name == null) {
			throw new ShopException("invalid name.");
		}
		checkId(itemId, "item", 8);
		Price pricePerItem;
		try {
			pricePerItem = Price.parsePrice(price);
		} catch (NullPointerException | IllegalArgumentException ex) {
			throw new ShopException("'" + price + "' is not a valid price.");
		}
		int id = Integer.parseInt(itemId);
		if (shoppingItems.anyMatch(item -> item != null && item.getId() == id)) {
			throw new ShopException("id '" + itemId + "' is already taken.");
		}
		shoppingItems.add(new ShoppingItem(name, id, pricePerItem));
	}
	
	public void addOrder(String orderId, String customerId, String itemId, String amount) throws ShopException {
		checkId(orderId, "order", 3);
		checkId(customerId, "customer", 4);
		checkId(itemId, "item", 8);
		
		if (amount == null || !amount.matches("\\d+") || Integer.parseInt(amount) < 1) {
			throw new ShopException("'" + amount + "' is not a valid amount.");
		}
		
		int cId = Integer.parseInt(customerId);
		Customer customer = customers.findFirstMatch(c -> c.getId() == cId);
		int iId = Integer.parseInt(itemId);
		ShoppingItem item = shoppingItems.findFirstMatch(i -> i.getId() == iId);
		
		if (customer == null) {
			throw new ShopException("customer '" + customerId + "' does not exist.");
		}
		if (item == null) {
			throw new ShopException("item '" + itemId + "' does not exist.");
		}
		
		int id = Integer.parseInt(orderId);
		if (orders.anyMatch(order -> order != null && order.getId() == id)) {
			throw new ShopException("id '" + orderId + "' is already taken.");
		}
		orders.add(new Order(id, customer, item, Integer.parseInt(amount)));
	}
	
	public Order getOrder(String orderId) throws ShopException {
		checkId(orderId, "order", 3);
		int id = Integer.parseInt(orderId);
		Order order = orders.findFirstMatch(o -> o.getId() == id);
		if (order == null) {
			throw new ShopException("order '" + orderId + "' does not exist.");
		}
		return order;
	}

	private void checkId(String id, String type, int length) throws ShopException {
		if (id == null || !id.matches("\\d{" + length + "}")) {
			throw new ShopException("'" + id + "' is not a valid " + type + " id.");
		}
	}
}
