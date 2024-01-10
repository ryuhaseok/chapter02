package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {

		//Ractangle r01 = new Ractangle(2, 2, "빨강", "빨강");
		
		Shape[] sArray = new Shape[3];
		
		//섞어 쓰기(부모 이름으로) - 오버라이딩 / 오버로딩과 구분(오버로딩은 같은 이름 메소드 자료형 다르게 씀)
		//부모만 보인다. 자식쪽은 사용 못함
		Shape s01 = new Ractangle(20, 20, "빨강", "빨강"); //사각형
		Shape s02 = new Triangle(100, 100, "노랑", "노랑"); //삼각형
		Shape s03 = new Circle(200, "파랑", "파랑"); //원
		
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		
		//다운캐스팅(자식까지 보이게 하기)
		//사격형의 가로값 가져오기
		//자료형 형변환과 같은 문법
		System.out.println(((Ractangle)sArray[0]).getWidth());
		
		//원의 반지름
		System.out.println(	((Circle)sArray[2]).getRadius()	);
		
		//전체면적 구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}

}
