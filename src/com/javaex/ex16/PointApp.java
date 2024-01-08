package com.javaex.ex16;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4,4);
		p.draw();
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.print();
		
	}

}
