package _07_static;

public class StaticFieldRun {

	public static void main(String[] args) {
		int stNum = StaticField.stNum;
		
		StaticField sf = new StaticField();
		System.out.println(sf.num);
		
		// 정적 필드는 참조변수, 정적필드명으로도 사용가능
		// 그러나 정적필드는 클래스명.정저필드명으로 사용하기를 권장
		String stName = sf.stName;
		
		StaticField.stMethod();

	}

}
