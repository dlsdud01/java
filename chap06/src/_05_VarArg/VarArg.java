package _05_VarArg;

public class VarArg {

	public static void main(String[] args) {
		
		/*	메서드 앞에 static 안붙이면 객체 생성 후 사용
		VarArg v = new VarArg();
		v.method(args);
		*/
		method("a","b","c");
		method("a","b","c","d","e","f");
	}
	/*
	void method(String s1) {
		System.out.println(s1);
	}
	void method(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
	void method(String s1, String s2, s3) {
		System.out.println(s1 + " " + s2 + s3);
	}
	*/
	static void method(String... str) {
		for(String s : str) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
