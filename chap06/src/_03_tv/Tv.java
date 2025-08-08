package _03_tv;

public class Tv {
	//속성
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 80;
	boolean power;
	int volume;
	int channel = 5;
	
	//기능, 메서드
	void power() {
		power = !power;
		if(power)
			System.out.println("전원이 켜졌습니다.");
		else
			System.out.println("전원이 꺼졌습니다.");
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	int channelDown() {
		channel--;
		return channel;
	}
	
	int setVolume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
}
