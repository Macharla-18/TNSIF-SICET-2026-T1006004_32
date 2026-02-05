package com.tnsif.Annotations;

public class Annote {
	
	public void show() {
		System.out.println("Parent");		
		}

}
class B extends Annote{
	@Override
	public void show() {
		System.out.println("child");
		
	}
}
