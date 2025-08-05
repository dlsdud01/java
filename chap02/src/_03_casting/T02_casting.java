package _03_casting;

public class T02_casting {

	public static void main(String[] args) {
		System.out.println("byte의 크기 : "+ Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE );
		System.out.println("short의 크기 : "+ Short.MIN_VALUE + " ~ " + Short.MAX_VALUE );
		System.out.println("int의 크기 : "+ Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE );
		System.out.println("char의 크기 : "+ (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE );
		System.out.println("----------------------------------------");
		
		int n1 = 123456;
		byte b1 = (byte)n1;
		System.out.println(b1);
		
		Long l1 = 12321421144214213L;
		float f1 = l1;
		System.out.println(f1);
		
		int n2 = 41423;
		char c1 = (char)n2;
		System.out.println(c1);
	}

}
