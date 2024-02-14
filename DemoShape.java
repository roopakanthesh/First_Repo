package com.kodnest.banking;

public class DemoShape {
	public static void main(String[] args) {
		Shape s;
		
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		s = c;
		s.draw();
		s = r;
		s.draw();
	}

}
