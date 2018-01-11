package de.seyfarth.tutorium.debugging;

public class ChainPart {

	private final Object content;
	private ChainPart next;
	
	public ChainPart(Object content) {
		this.content = content;
	}

	public Object getContent() {
		return this.content;
	}
	
	public ChainPart getNext() {
		return this.next;
	}
	
	public void setNext(ChainPart next) {
		this.next = next;
	}
}
