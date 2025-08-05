package _02_Scanner;

public class T03_printf {

	public static void main(String[] args) {
		
		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d\n", 10, 20);
		
		int num1 = 100;
		int num2 = 200;
		System.out.printf("%d, %d\n", num1, num2);
		
		// 8진수
		System.out.printf("%o\n", 9);
		
		// 16진수
		System.out.printf("%x\n", 11);
		
		// 실수
		System.out.printf("%f\n", 11.43);
		
		// 문자 1개
		System.out.printf("%c\n", 'a');
		
		// 문자열
		System.out.printf("%s\n", "apple");
		
		// boolean
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", 4>5);
		
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균 온도는 %.1f도 입니다.\n", 2025, 8, 34.5);
		System.out.printf("이 과정의 정원은 %d명이고, 현재 %d명이 수강중 입니다. %.0f%% 달성하였습니다.", 25, 19, (double)19/25*100);
	}

}
