package de.seyfarth.tutorium.debugging;

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
		first = null;
	}

	public Object get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		ChainPart current = this.first;
		int currentIndex = 0;
		while (currentIndex != index) {
			current = current.getNext();
		}
		return current;
	}

	public Object set(int index, Object element) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		if (index == 0) {
			ChainPart next = this.first.getNext();
			this.first = new ChainPart(element);
			this.first.setNext(next);
		}
		ChainPart current = this.first;
		ChainPart previous = null;
		int previousIndex = -1;
		do {
			previous = current;
			current = current.getNext();
		} while (previousIndex != index);
		ChainPart inserted = new ChainPart(element);
		previous.setNext(inserted);
		inserted.setNext(current.getNext());
		return current.getContent();
	}

	public void add(int index, Object element) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		if (index == 0) {
			ChainPart old = this.first;
			this.first = new ChainPart(element);
			this.first.setNext(old);
		} else if (index == size()) {
			add(element);
		} else {
			ChainPart previous = ofIndex(index - 1);
			ChainPart next = previous.getNext();
			previous.setNext(new ChainPart(element));
			previous.getNext().setNext(next);
		}
	}

	public Object remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		if (index == 0) {
			Object removedContent = this.first.getContent();
			this.first = this.first.getNext();
			return removedContent;
		}
		ChainPart previous = ofIndex(index - 1);
		ChainPart removed = previous.getNext();
		previous.setNext(removed.getNext());
		return removed.getContent();
	}

	public int indexOf(Object o) {
		ChainPart current = this.first;
		int index = 0;
		while (current != null) {
			if (current.getContent() == o) {
				return index;
			}
			current = current.getNext();
			index++;
		}
		return -1;
	}

	public int lastIndexOf(Object o) {
		ChainPart current = this.first;
		int index = 0;
		int lastIndex = -1;
		while (current != null) {
			if (current.getContent() == o) {
				lastIndex = index;
			}
			current = current.getNext();
			index++;
		}
		return lastIndex;
	}

	private ChainPart ofIndex(int index) {
		ChainPart current = this.first;
		int currentIndex = 0;
		while (current != null) {
			if (currentIndex == index) {
				return current;
			}
			current = current.getNext();
			currentIndex++;
		}
		return null;
	}
}
