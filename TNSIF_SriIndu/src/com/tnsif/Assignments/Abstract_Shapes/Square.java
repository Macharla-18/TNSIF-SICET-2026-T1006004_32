package com.tnsif.Assignments.Abstract_Shapes;

public class Square extends Shape{
	private int s;
	Square(int s){
		this.s=s;
	}
	public void setS(int s) {
		this.s=s;
	}
	public int getS() {
		return s;
	}
	public void calcArea() {
		area=s*s;

	}

}
