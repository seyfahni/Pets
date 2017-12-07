package de.seyfarth.tutorium.tasks;

public class Chain {

	private ChainPart first;

	public Chain() {
	}

	public int size() {
		ChainPart current = this.first;
		int size = 0;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public boolean contains(Object o) {
		ChainPart current = this.first;
		while (current != null) {
			if (current.getContent() == o) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public boolean add(Object e) {
		if (this.first == null) {
			this.first = new ChainPart(e);
		} else {
			ChainPart current = this.first;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new ChainPart(e));
		}
		return true;
	}

	public boolean remove(Object o) {
		ChainPart current = this.first;
		while (current != null) {
			if (current.getContent() == o) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public void clear() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public Object get(int index) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public Object set(int index, Object element) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public void add(int index, Object element) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public Object remove(int index) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public int indexOf(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
