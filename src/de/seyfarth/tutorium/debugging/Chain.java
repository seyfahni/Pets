package de.seyfarth.tutorium.debugging;

/**
 * This is an single linked list.
 * 
 * @see ChainPart
 * @see java.util.LinkedList
 * @param <E> The Type this list contains
 */
public class Chain<E> {

    /**
     * 
     */
    private ChainPart<E> first;

    /**
     * 
     */
    public Chain() {
    }

    /**
     * This method enables the user to retrieve this lists size. It should never
     * throws {@link NullPointerException} or any other exception.
     * 
     * @return the size of the list
     */
    public int size() {
        ChainPart<E> current = this.first;
        int size = 0;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    /**
     * Checks if the list is empty. Equals {@link #size()} == 0.
     * {@link java.util.LinkedList#size()}
     * 
     * @return true if empty
     */
    public boolean isEmpty() {
        return this.first == null;
    }

    public boolean contains(E o) {
        ChainPart<E> current = this.first;
        while (current != null) {
            if (current.getContent() == o) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean add(E e) {
        if (this.first == null) {
            this.first = new ChainPart<>(e);
        } else {
            ChainPart<E> current = this.first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new ChainPart<>(e));
        }
        return true;
    }

    public boolean remove(E o) {
        ChainPart<E> current = this.first;
        while (current != null) {
            if (current.getContent() == o) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     *
     * @deprecated shuld not be used
     */
    @Deprecated
    public void clear() {
        first = null;
    }

    /**
     *
     * @param index
     * @throws IndexOutOfBoundsException if index smaller than 0 or geater equals size()
     * @return 
     */
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        ChainPart<E> current = this.first;
        int currentIndex = 0;
        while (currentIndex != index) {
            current = current.getNext();
        }
        return current.getContent();
    }

    public E set(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        if (index == size()) {
            add(element);
            return null; 
        }
        if (index == 0) {
            ChainPart<E> next = this.first.getNext();
            E replacedContent = this.first.getContent();
            this.first = new ChainPart<>(element);
            this.first.setNext(next);
            return replacedContent;
        }
        ChainPart<E> current = this.first;
        ChainPart<E> previous = null;
        int previousIndex = -1;
        do {
            previous = current;
            current = current.getNext();
        } while (previousIndex != index);
        ChainPart<E> inserted = new ChainPart<>(element);
        previous.setNext(inserted);
        inserted.setNext(current.getNext());
        return current.getContent();
    }

    public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        if (index == 0) {
            ChainPart<E> old = this.first;
            this.first = new ChainPart<>(element);
            this.first.setNext(old);
        } else if (index == size()) {
            add(element);
        } else {
            ChainPart<E> previous = ofIndex(index - 1);
            ChainPart<E> next = previous.getNext();
            previous.setNext(new ChainPart<>(element));
            previous.getNext().setNext(next);
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        if (index == 0) {
            E removedContent = this.first.getContent();
            this.first = this.first.getNext();
            return removedContent;
        }
        ChainPart<E> previous = ofIndex(index - 1);
        ChainPart<E> removed = previous.getNext();
        previous.setNext(removed.getNext());
        return removed.getContent();
    }

    public int indexOf(E o) {
        ChainPart<E> current = this.first;
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

    public int lastIndexOf(E o) {
        ChainPart<E> current = this.first;
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

    private ChainPart<E> ofIndex(int index) {
        ChainPart<E> current = this.first;
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
