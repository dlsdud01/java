package _12_singleton;

/*
 * 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
 * - 사용하는 이유 : 최초로 만들어진 객체를 재활용하는 패턴
 * 				  생성자를 통해 여러 ㅂ ㅓㄴ 호출이 되더라도 객체는 새로 생성하지 않음
 * - 장점: 메모리 낭비 방지
 * - 단점:
 * 		1. 의존성이 높아진다.
 * 		2. private 생성자를 이용하기 때문에 상속이 어렵다.
 * 		3. 테스트가 힘들다.
 */
class Singleton {
	private static Singleton singleton = new Singleton();
	
	//객체를 생성하지 못하도록 막아 놓음
	private Singleton() {
		System.out.println("객체 생성");
	}
	
	// getter 메소드
	static Singleton getSingleton() { // 정적 메서드 				인스턴스 메서드 ( 사용하려면 객체생성 해야함)
		return singleton;
	}
}
public class SingletonRun {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		System.out.println(s1);
		
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s2);
	}

}
