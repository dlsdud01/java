package _06_constructor;

public class Tv {
	String company = "LG";
	String model;
	int channel;
	int volume;
	
	Tv(String company, String model, int channel) {
		System.out.println("Tv 생성자 호출");
		this.company = company;
		this.model = model;
		this.channel = channel;
	}
}
