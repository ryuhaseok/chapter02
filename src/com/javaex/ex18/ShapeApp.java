package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		//도형(부모)
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		System.out.println(s01.toString());
		
		//사각형(자식)
		Ractangle[] rArray = new Ractangle[2];
		Ractangle r01 = new Ractangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
		//System.out.println(r01.toString());
		Ractangle r02 = new Ractangle(40, 40, "파랑", "검정");
		//System.out.println(r02.toString());
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i = 0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		
		//삼각형
		Triangle t01 = new Triangle(10, 10, "주황", "검정");
		//System.out.println(t01.toString());
		Triangle t02 = new Triangle(20, 20, "초록", "검정");
		//System.out.println(t02.toString());
		
		Triangle[] tArray = new Triangle[2];
		tArray[0] = t01;
		tArray[1] = t02;
		
		for(int i=0; i<tArray.length; i++) {
			System.out.println(tArray[i].toString());
		}
		
		//원
		Circle c01 = new Circle(15, "빨강", "초록");
		//System.out.println(c01.toString());
		Circle c02 = new Circle(25, "검정", "빨강");
		//System.out.println(c02.toString());
		
		Circle[] cArray = new Circle[2];
		cArray[0] = c01;
		cArray[1] = c02;
		
		for(int i=0; i<cArray.length; i++) {
			System.out.println(cArray[i].toString());
		}
		
	}

}
