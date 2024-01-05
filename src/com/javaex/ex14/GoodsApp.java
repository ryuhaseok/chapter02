package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		
		// 배열만들기
		Goods[] goodsArray = new Goods[5];
		
		//상품만들기
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
		
		//배열에 상품 넣기
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		/*
		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());
		*/
		
		//null - 주소가 없다
		for(int i =0; i<goodsArray.length; i++) {
			if (goodsArray[i] != null) { // != null -> 주소가 있으면
				goodsArray[i].showInfo();
				
			} 

		}
		int sum = 0;
		for (int i=0; i<goodsArray.length; i++) {
			if(goodsArray[i] != null) {
				sum++; //sum=sum+1 or sum+=1 셋 다 같은 것
			}
		}
		System.out.println("전체상품갯수:"+sum);
		
	}

}
