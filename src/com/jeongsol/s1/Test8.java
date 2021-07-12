package com.jeongsol.s1;

public class Test8 {
	public static void main(String [] args) {
		System.out.println("==== Test8 Start ====");
		
		// 물건 값의 합계
		int price;
		// 손님이 낸 돈
		int money;
		// 거스름돈
		int don;
		
		// 물건 값의 합계보다 손님이 낸 돈이 더 많다라는 가정
		// 1. 물건 값의 합계, 손님이 낸 돈, 거스름돈 출력
		
		price = 57860;
		money = 100000;
		don = money - price;
		
		System.out.println("물건 값의 합계 : " +price);
		System.out.println("손님이 낸 돈 : " +money);
		System.out.println("거스름돈 : " +don);
		
		// 만원짜리 개수를 담을 변수
		int man;
		// 천원짜리 개수를 담을 변수
		int cheon;
		// 백원짜리 개수를 담을 변수
		int back;
		// 십원짜리 개수를 담을 변수
		int sip;
		
		//man = don / 10000;
		//cheon = (don - (man * 10000)) / 1000;
		//back = (don - (man * 10000) - (cheon * 1000)) /100;
		//sip = (don - (man * 10000) - (cheon * 1000) - (back * 100)) / 10;
		
		man = don / 10000;
		cheon = don % 10000 / 1000;
		back = don % 1000 /100;
		sip = don % 100 / 10;
		
		System.out.println("만원 " +man +"장");
		System.out.println("천원 " +cheon +"장");
		System.out.println("백원 " +back +"장");
		System.out.println("십원 " +sip +"장");
	}

}
