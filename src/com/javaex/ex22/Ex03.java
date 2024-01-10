package com.javaex.ex22;

public class Ex03 {

	public static void main(String[] args) {

		Point p01 = new Point(2, 2);
		p01.draw();
		
		Point p02;
		
		System.out.println("안녕하세요");
		
		try {
			p02 = null; 
			p02.draw();
			
		} catch (NullPointerException e) {
			System.out.println("주소값이 없습니다.");
		}
		
		System.out.println("종료");
		
	}

}
