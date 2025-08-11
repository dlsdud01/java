package _07_static;

public class StaticField {
	// 인스턴스 필드
	int num = 3;
	String name = "인스턴스 필드";
	
	// 정적 필드
	static int stNum = 10;
	static String stName = "정적 필드";
	
	// 인스턴스 메소드
	/*
	 * 인스턴스 필드 안에 내용과 정적필드 내용 상관없이 모두 사용 가능
	*/
	 
	void method() {
		System.out.println("인스턴스 메소드 method");
		System.out.println(num);	// 인스턴스 필드 호출 가능
		System.out.println(stNum);	// 정적 필드 호출 가능
	}
	
	String methodSt() {
		System.out.println("인스턴스 메소드 methodSt()");
		return name;
	}
	
	// 정적 메소드
	static void stMethod() {
		System.out.println("정적메소드 stMethod()");
		System.out.println(stNum);
		//System.out.println(num);	// 사용불가
	}
	
	static String stMethod2() {
		System.out.println("정적메소드 stMethod2()");
		return stName;
	}
}
