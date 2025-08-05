package _02_Scanner;

import java.util.Scanner;

public class T01_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("이름 : "+ name);

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("나이 : "+ age);
		
		System.out.print("키를 입력하세요 : ");
		double tall = sc.nextDouble();
		System.out.println("키 : "+ tall);
		
		System.out.print("당신은 여자입니까(true/false)? : ");
		boolean answer = sc.nextBoolean();
		System.out.println("당신은 여자입니까? : "+ answer);
		
		sc.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println("주소 : "+ address);
		
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.println("성별 : "+ gender);
		
		
	}

}
