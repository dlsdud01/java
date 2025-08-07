package _02_repetitive;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, math, eng, total;
		double ave;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		total = kor + math + eng;
		ave = total / 3.0;
		
		if((kor>=40)&&(math>=40)&&(eng>=40) && ave>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println("------------------------------------");
		
		String id, pw, uid, upw;
		
		id = "user";
		pw = "password";
		
		System.out.print("아이디 : ");
		uid = sc.next();
		System.out.print("비밀번호 : ");
		upw = sc.next();
		
		if (!uid.equals(id)) {
		    System.out.println("아이디가 틀렸습니다.");
		} else if (!upw.equals(pw)) {
		    System.out.println("비밀번호가 틀렸습니다.");
		} else {
		    System.out.println("로그인 성공");
		}
		
		System.out.println("------------------------------------");
		
		double tall, weight, bmi;
		
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		System.out.print("키 : ");
		tall = sc.nextDouble();
		
		bmi = weight / (tall * tall);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && 23 > bmi) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && 25 > bmi) {
			System.out.println("과체중");
		} else if (bmi >= 25 && 30 > bmi) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
		System.out.println("------------------------------------");
		
		double mid, fin, work, total2;
		int atd;
		
		System.out.print("중간고사 점수 : ");
		mid = sc.nextDouble();
		System.out.print("기말고사 점수 : ");
		fin = sc.nextDouble();
		System.out.print("과제점수 : ");
		work = sc.nextDouble();
		System.out.print("츨석 회수 : ");
		atd = sc.nextInt();
		
		System.out.println("============= 결과 ============");
		
		mid = mid/100 * 0.2;
		fin = fin/100 * 0.3;
		work = work/100 * 0.3;
		total2 = mid + fin + work + atd;
		
		System.out.printf("중간 고사 점수(20) : %.1f\n", mid);
		System.out.printf("기말 고사 점수(30) : %.1f\n", fin);
		System.out.printf("과제 점수(30) : %.1f\n", work);
		System.out.printf("출석 점수(20) : %.1f\n", (double)atd);
		System.out.printf("총점 : %.1f\n", total);
		
		if(total < 70) {
			System.out.println("Fail [점수미달]");
		} else if(atd <= 14) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)]\n", atd);
		} else {
			System.out.println("Pass");
		}
		
	}

}
