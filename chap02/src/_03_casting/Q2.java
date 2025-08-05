package _03_casting;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.next().charAt(0);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double tall = sc.nextDouble();
		
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^\n", tall, age, gender, name);
		
		System.out.println("-------------------------------");
		
		System.out.print("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int n2 = sc.nextInt();
		
		System.out.printf("더하기 결과 : %d\n", n1 + n2);
		System.out.printf("빼기 결과 : %d\n", n1 - n2);
		System.out.printf("곱하기 결과 : %d\n", n1 * n2);
		System.out.printf("나누기 몫 결과 : %d\n", n1 / n2);
		
		System.out.println("-------------------------------");
		
		System.out.print("키보드 가로 : ");
		double width = sc.nextDouble();
		System.out.print("키보드 세로 : ");
		double height = sc.nextDouble();
		
		System.out.printf("키보드 면적 : %.2f\n키보드 둘레 : %.1f\n", width*height, (width+height)*2);
		
		System.out.println("-------------------------------");
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));

	}

}
