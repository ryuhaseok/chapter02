package com.javaex.ex16;

public class ColorPoint extends Point {

	//필드
	private String color;
	
	//생성자
	public ColorPoint () {
		System.out.println("ColorPoint()");
	}
	public ColorPoint (String color) {
		//상속 받은 경우 부모의 디폴트생성자가 필요
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	public ColorPoint (int x, int y, String color) {
		super();
		super.setX(x);
		super.setY(y);
		this.color = color;
		System.out.println("ColorPoint(3)");
	}
	
	//메소드 g/s
	
	//메소드 일반
	public void print() {
		System.out.println("점[x=" + super.getX() + ", y=" + super.getY() + " 색=" +this.color + "]을 그렸습니다.");
	}
	
}
