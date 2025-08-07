package _02_repetitive;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice = (int)(Math.random() * 6) + 1;
		int aws;
		do {
			System.out.print("숫자 맞추기(1~6): ");
			aws = sc.nextInt();
		} while (aws != dice);
		System.out.println("축하합니다. 맞췄습니다. ");
	
		System.out.println("------------------------------------");
		
		int sum = 0;
		
		for (int i = 1; i <=100; i++) {
			if(i%5 == 0) {
				sum+=i;
			}
		}
		System.out.printf("5의 배수의 합계는 %d\n", sum);
		
		System.out.println("------------------------------------");
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <=100; i++) {
			if(i%2== 0) {
				sum2+=i;
			} else {
				sum1+=i;
			}
		}
		System.out.printf("짝수의 합계는 %d\n", sum2);
		System.out.printf("홀수의 합계는 %d\n", sum1);
		
		System.out.println("------------------------------------");
		
		for(int x=1; x<=6 ; x++) {
			for (int y=1; y<=6; y++) {
				if (x + y == 6) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
		System.out.println("------------------------------------");
		
		for(int x=1; x<=5 ; x++) {
			for (int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		for(int x=5; x>=1 ; x--) {
			for (int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
	
		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 4 - i; j++) {
		        System.out.print(" "); 
		    }
		    for (int j = 0; j < 2 * i + 1; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		int dice2;
		int cnt = 0;
		do {
			dice2 = (int)(Math.random() * 6) + 1;
			System.out.printf("(%d)",dice2);
			cnt++;
		} while (6 != dice2);
		System.out.printf("총 주사위 굴린 횟수는 %d", cnt);

	}
	
}
