package _03_casting;

public class T03_casting_Op {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		
		// byte result = b1 + b2;
		int result = b1 + b2;
		
		char c1 = 'A';
		// char c2 = c1 + 5;
		int c3 = c1 + 5;
		
		System.out.println((char)c3);
		
		int n1 = 100;
		int n2 =3;
		int result2 = n1 / n2;
		
		System.out.println(result2);
		
		double d1 = 100;
		double result3 = n1 / d1;
		System.out.println(result3);
		
		
		int i1 = (int)(n1 / d1);
		int i2 = n1 / (int)d1;
	}

}
