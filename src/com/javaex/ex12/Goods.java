package com.javaex.ex12;

public class Goods {

	//필드
	private String name;
	private int price;
	public static int count; //전역 변수
	//메모리별 상호 접근 불가하지만
	//static은 공통 사용 가능 공간.  static은 계속 올라가 있기 때문에 메모리 관리를 위해 신중하게.
	
	//생성자
	public Goods() {
		count = count+1;
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count +1;
	}
	
	//메소드 gs
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
	public int getCount() {
		return count;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
}
