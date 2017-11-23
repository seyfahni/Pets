package de.seyfarth.tutorium.abstraction;

public class GrandChild extends Child {

	public void foo(boolean skip) {
		if (skip) {
			super.foobar();
		} else {
			foobar();
		}
	}

	@Override
	public void foobar() {
		System.out.println("FOOBAR");
	}
	
}
