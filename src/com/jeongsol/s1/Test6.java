package com.jeongsol.s1;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("==== Test6 Start ====");
		
		// 5 int
		// 3.12 double
		int num = 5;
		double num2 = 3.12;
		num = num + (int)num2;
		// num = (int)(num + num2);
		System.out.println("Num : "+num);
		
		// 국영수 - 0 - 100
		int kor = 63;
		int eng = 35;
		int math = 53;
		// 총점을 계산해서 총점 출력
		int total = kor + eng + math;
		System.out.println("Total: " +total);
		// 평균을 계산하여 평균 출력
		double avg = (double) total / 3; // 자동 형 변환
		System.out.println("Avg: " +avg);
		
		double num3 = 5.124;
		int result = (int)num3;
		System.out.print("Result: " +result);
	}
}
