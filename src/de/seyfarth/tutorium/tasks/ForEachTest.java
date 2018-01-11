package de.seyfarth.tutorium.tasks;

import de.seyfarth.tutorium.debugging.ChainPart;

public class ForEachTest {
	public static void main(String[] args) {
		String[] strings = {"1" , "2", "3", "4"};
		for (String string : strings) {
			System.out.print(string + " ");
		}
		
		System.out.println();
		
		ChainPart firstChainPart = new ChainPart("1");
		firstChainPart.setNext(new ChainPart("2"));
		firstChainPart.getNext().setNext(new ChainPart("3"));
		firstChainPart.getNext().getNext().setNext(new ChainPart("4"));
		ChainPart current = firstChainPart;
		while (current != null) {
			System.out.print(current.getContent() + " ");
			current = current.getNext();
		}
		
		System.out.println();
		
	}
}
