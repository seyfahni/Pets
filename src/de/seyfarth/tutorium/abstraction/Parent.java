package de.seyfarth.tutorium.abstraction;

public abstract class Parent {
	
	public void foo() {
		System.out.println("foo");
	}
	
	public abstract void bar();
	
	public void foobar(){
		System.out.println("foobar");
	}
}
