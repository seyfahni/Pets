package de.seyfarth.tutorium.exercise4.taskA;

public class Customer {
	
	private final int id;
	private final String forename;
	private final String surname;

	public Customer(String forename, String surname, int id) {
		if (forename == null || surname == null) {
			throw new NullPointerException();
		}
		
		this.forename = forename;
		this.surname = surname;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return forename + "," + surname + "," + id;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23 * hash + this.id;
		hash = 23 * hash + this.forename.hashCode();
		hash = 23 * hash + this.surname.hashCode();
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
		final Customer other = (Customer) obj;
		if (this.id != other.id) {
			return false;
		}
		if (!this.forename.equals(other.forename)) {
			return false;
		}
		if (!this.surname.equals(other.surname)) {
			return false;
		}
		return true;
	}
}
