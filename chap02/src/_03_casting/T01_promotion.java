package _03_casting;

public class T01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = b1;
		
		int i1 = b1;
		i1 = s1;
		
		char c1 = '김';
		int ic = c1;
		
		System.out.println(c1);
		System.out.println(ic);
		
		double d1 = i1;
		System.out.println(d1);
		
		int i2 = s1 + 1;
		
		int i3 = c1 + 1;
		
		int i4 = b1 + s1;
	}

}
