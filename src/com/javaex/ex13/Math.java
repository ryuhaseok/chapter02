package com.javaex.ex13;

public class Math {
	
	//필드
	private static double pi = 3.14;
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double circleArea(int radius) {
		return pi*radius*radius;
	}

}
