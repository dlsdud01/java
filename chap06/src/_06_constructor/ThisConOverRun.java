package _06_constructor;
class ThisConOver {
	int n;
	double d;
	String name;
	
	ThisConOver() {
		this(1,1.0,"홍길동");
		System.out.println("매개변수가 없는 생성자");
	}
	
	ThisConOver(int n) {
		this(n , 1.0, "홍길동");
		System.out.println("매개변수가 1개인 생성자");
	}
	ThisConOver(String name) {
		this(1 , 1.0, name);
		System.out.println("매개변수가 1개인 생성자");
	}
	ThisConOver(int n, double d) {
		this(n , d, "홍길동");
		System.out.println("매개변수가 2개인 생성자");
	}
	ThisConOver(int n, double d, String name) {
		System.out.println("매개변수가 3개인 생성자");
		this.n = n;
		this.d = d;
		this.name = name;
	}
	
	void info() {
		System.out.println("int : " + n);
		System.out.println("double : " + d);
		System.out.println("name : " + name);
	}
}

public class ThisConOverRun {

	public static void main(String[] args) {
		ConOver co = new ConOver();
		co.info();
		
		co = new ConOver(10);
		co.info();

	}

}
