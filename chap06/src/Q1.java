/*
 * class Person {
 
	String name = "이름";
	String gender = "성별";
	int age;
	int height;
	int wieght;
}
*/

public class Q1 {

	public static void main(String[] args) {
		Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();
		
		System.out.println("ex1 == ex2 : " + (ex1 == ex2));

	}

}
class Excercise {
	private static Excercise excercise;
	
	private Excercise() {
		System.out.println("객체 생성");
	}
	
	static Excercise getInstance() {
		return excercise;
	}
}
