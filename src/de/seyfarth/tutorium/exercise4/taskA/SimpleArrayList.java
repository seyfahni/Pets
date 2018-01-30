package de.seyfarth.tutorium.exercise4.taskA;

public class SimpleArrayList<E> {
	
	private Object[] elements;
	private int size;

	public SimpleArrayList() {
		elements = new Object[8];
	}

	public void add(E element) {
		enlargeIfRequired();
		elements[size] = element;
		size++;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		return (E) elements[index];
	}
	
	private void enlargeIfRequired() {
		if (elements.length == size) {
			enlarge();
		}
	}
	
	private void enlarge() {
		Object[] larger = new Object[elements.length * 2];
		System.arraycopy(elements, 0, larger, 0, elements.length);
		elements = larger;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(E element) {
		for (Object content : elements) {
			if(content == element) {
				return true;
			}
		}
		return false;
	}
	
	public E findFirstMatch(Matcher<E> matcher) {
		for (int index = 0; index < size; index++) {
			if (matcher.matches(get(index))) {
				return get(index);
			}
		}
		return null;
	}
	
	public boolean anyMatch(Matcher<E> matcher) {
		for (int index = 0; index < size; index++) {
			if (matcher.matches(get(index))) {
				return true;
			}
		}
		return false;
	}
}
