package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	/*
	생성자를 만들지 않아도 디폴트 생성자가 존재.
	그러나 생성자를 새로 만들면 디폴트 생성자가 사라짐.
	따라서 디폴트 생성자도 새로운 생성자도 동시에 사용해야한다면
	디폴트 생성자도 작성해주면 해결.
	*/
	// 생성자 오버로딩 - 같은 이름의 여러개 생성자 사용가능
	// 그러나 자료형이 같은 생성자는 변수명을 달리 하더라도 구분할 수 없음.
	// 생성자는 한 번 쓰면 끝
	public Goods() {
		//메모리에 올리는 일을 수행함(클래스를 인스턴스화한다)
		System.out.println("Goods()");
	}
	
	public Goods(String name) {
		//메모리에 올리는 일을 수행함(클래스를 인스턴스화한다)
		this.name = name; //추가 수행
		System.out.println("Goods(name)");
	}
	
	public Goods(String name, int price) {
		this(name); //기존 생성자를 선택해 호출할 수 있음
		this.price = price;
		System.out.println("Goods(name, price)");
	}
	
	//메소드-g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
}
