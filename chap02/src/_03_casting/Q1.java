package _03_casting;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력하시오 : ");
		char c = sc.next().charAt(0);
		System.out.println("입력받은 문자의 유니코드는 " + (int)c + " 입니다.");
		
		System.out.println("-------------------------------");
		
		System.out.println("과목별 점수를 입력하시오.");
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double ave = total / 3.0;
		System.out.printf("총점 : %d, 평균 : %.2f\n", total, ave);
		
		System.out.println("--------------------------------");
		
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K'; 
	    
	    System.out.println("iNum1 / iNum2 = " + iNum1/iNum2);
	    double result1 = iNum2 * dNum;
	    System.out.printf("iNum2 * dNum  = %f\n", result1);
	    System.out.println("iNum1 = " + (double)iNum1);
	    System.out.println("iNum1 / iNum2 = " + (double)iNum1/iNum2);
	    System.out.println("iNum1 / fNum = " + iNum1 / (int)fNum);
	    System.out.printf("iNum1 / fNum = %.13f\n", iNum1 / fNum);
	    System.out.println("ch의 유니코드 : " + (int)ch);
	    ch = 'K' + 1;
	    System.out.println("ch의 유니코드 : " + (int)ch);
	}

}
