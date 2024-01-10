package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {

		//Drawable 배열만들기
		Drawable[] dArray = new Drawable[4];
		
		//그릴 수 있는 Drawable
		//사각형
		Drawable d01 = new Ractangle(100, 100, "빨강", "빨강");
		//포인트
		Drawable d02 = new Point(2, 2);
		//원
		Drawable d03 = new Circle(50, "파랑", "파랑");
		//삼각형
		Drawable d04 = new Triangle( 20, 20, "노랑", "노랑" );
		
		dArray[0] = d01;
		dArray[1] = d02;
		dArray[2] = d03;
		dArray[3] = d04;
		
		for( int i=0; i<dArray.length; i++ ) {
			dArray[i].draw();
		}
		
		//사각형의 가로
		System.out.println(	((Ractangle)dArray[0]).getWidth()	);
		
		//원의 넓이
		System.out.println(	((Circle)dArray[2]).area()	);
		System.out.println(	((Shape)dArray[2]).area()	);
		
		//점 y값
		System.out.println(	((Point)dArray[1]).getY()	);
		
		System.out.println("-----------------------------------------");
		//전체에서 도형의 넓이를 출력
		for( int i=0; i<dArray.length; i++ ) {
			if(	dArray[i] instanceof Shape	) {
				System.out.println(	((Shape)dArray[i]).area()	);
			}
		}
		
		
	}

}
