package com.jeongsol.s1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("==== Test10 Start ====");
		
		// 0 -> 0
		// 1 -> 1
		// 2 -> 2
		// 3 -> 3
		// 4 -> 10
		// 5 -> 11
		// 6 -> 12
		// 7 -> 13
		// 8 -> 20
		// 12 -> 30
		// 13 -> 31
		// 17 -> 41
		
		// 4, 10
		// 뱐수 - 변하는 수
		// 변수 선언 - 데이터타입 변수명
		// java는 필요할 때 변수 선언 가능
		
		// 실행 중에 데이터를 키보드로부터 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		int input = 10;
		int output = 0;
		
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt();
		output = input / 4 * 10 + input % 4 ;
		
		System.out.println("Input: " +input);
		System.out.println("Output: " +output);
		
		// Github 사용하기
		// Code 추가
	}

}
