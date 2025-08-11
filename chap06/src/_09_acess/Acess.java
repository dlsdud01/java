package _09_acess;

public class Acess {
	private int num = 5;
	
	// setter 메소드 : private로 된 피드에 값을 넣을때
	void setNum(int num) {
		this.num = num;
	}
	
	// getter 메소드 : private로 된 필드의 값을 얻어올 때
	int getNum() {
		return num;
	}
}
