package de.seyfarth.tutorium.debugging;

public class ChainPart<E> {

	private final E content;
	private ChainPart<E> next;
	
	public ChainPart(E content) {
		this.content = content;
	}

	public E getContent() {
		return this.content;
	}
	
	public ChainPart<E> getNext() {
		return this.next;
	}
	
	public void setNext(ChainPart<E> next) {
		this.next = next;
	}
}
