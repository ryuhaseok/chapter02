package com.javaex.ex07;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		System.out.println("Point()");
	}
	
	public Point(int x) {
		this.x = x;
		System.out.println("Point(int x)");
	}
	
	public Point(int x, int y) {
		this(x); //다른 생성자를 this로 가져올때는 제일 위에
		this.y = y;
		System.out.println("Point(int x, int y)");
	}
	
	//메소드-gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
}
