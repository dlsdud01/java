package _02_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어 컴퓨터 수학 점수를 사용자로부터 입력받아 저장하고 총점 평균 출력
		
		Scanner sc = new Scanner(System.in);
		int math, kor, com;
		
		System.out.println("점수를 입력하시오.");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.print("컴퓨터 : ");
		com = sc.nextInt();
		
		int total = kor + math + com;
		double ave = (double)total / 3.0;

		System.out.printf("총점 : %d 평균 : %.2f\n", total, ave);
	}

}
