package _06_constructor;
class ConOver {
	int n;
	double d;
	String name;
	
	ConOver() {
		System.out.println("매개변수가 없는 생성자");
		n = 1;
		d = 1.0;
		name = "홍길동";
	}
	
	ConOver(int n) {
		System.out.println("매개변수가 1개인 생성자");
		this.n = n;
		d = 1.0;
		name = "홍길동";
	}
	ConOver(String name) {
		System.out.println("매개변수가 1개인 생성자");
		n = n;
		d = 1.0;
		this.name = name;
	}
	ConOver(int n, double d) {
		System.out.println("매개변수가 2개인 생성자");
		this.n = n;
		this.d = d;
		name = "홍길동";
	}
	ConOver(int n, double d, String name) {
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

public class ConOverRun {

	public static void main(String[] args) {
		ConOver co = new ConOver();
		co.info();
		
		co = new ConOver(10);
		co.info();

	}

}
