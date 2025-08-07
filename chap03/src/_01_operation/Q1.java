package _01_operation;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.printf("입력받은 정수는 %s니다.\n", (n1 > 0 ? "양수 입" : "양수가 아닙"));
		
		System.out.println("-----------------------------------");
		
		System.out.print("정수 입력 : ");
		int n2 = sc.nextInt();
		System.out.printf("입력받은 정수는 %s니다.\n", (n2 > 0 ? "양수 입" : (n2 < 0 ? "음수 입" : "0 입")));
		
		System.out.println("-----------------------------------");
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.printf("입력한 정수는 %s입니다.\n", (num % 2 == 0 ? "짝수" : "홀수"));
		
		System.out.println("-----------------------------------");

		System.out.print("인원 수 입력 : ");
		int person = sc.nextInt();
		System.out.print("사탕 수 입력 : ");
		int candy = sc.nextInt();
		
		System.out.printf("인당 사탕 갯수 : %d\n남는 갯수 : %d\n", candy/person, candy%person);
		
		System.out.println("-----------------------------------");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classroom = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int no = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소숫점 둘쨰 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s의 성적은 %.2f이다.\n", grade, classroom, no, 
				(gender == 'M' ? "남학생" : "여학생"), score);
		
		System.out.println("-----------------------------------");
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.printf("%s\n", (age<=13 ? "어린이" : 
			(age >=14 && age <= 19 ? "청소년" : "성인")));
		
		System.out.println("-----------------------------------");
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		double ave = (kor + math + eng) / 3.0;
		
		boolean ox = (kor >= 40) && (math >= 40) && (eng >= 40);
		
		System.out.printf("%s", ox && (ave >= 60) ? "합격" : "불합격");
		
		System.out.println("-----------------------------------");
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char n3 = sc.next().charAt(8);
		
		System.out.printf("%s입니다.\n", (n3 == '1') || (n3 == '3') ? "남자" : "여자");
		
		System.out.println("-----------------------------------");
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = sc.nextInt();
		
		System.out.printf("%s입니다.\n", (num3 < num1) || (num3 > num2) ? "true" : "false");
		
		System.out.println("-----------------------------------");
		
		System.out.print("정수1 입력 : ");
		int i1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int i2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int i3 = sc.nextInt();
		
		boolean same = i1 == i2 && i2 == i3;
		System.out.printf("%s\n", same ? "true" : "false");
	}

}
