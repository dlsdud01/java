package _06_constructor;

public class TvRun {

	public static void main(String[] args) {
		Tv tv = new Tv("SAMSUNG", "울트라 Tv", 11);
		System.out.println("제조사 : " + tv.company);
		System.out.println("모델명 : " + tv.model);
		System.out.println("채널 : " + tv.channel);
		System.out.println("-".repeat(40));
		
		Tv tv1 = new Tv("Raser", "FULL HD", 16);
		System.out.println("제조사 : " + tv1.company);
		System.out.println("모델명 : " + tv1.model);
		System.out.println("채널 : " + tv1.channel);
		System.out.println("-".repeat(40));
		
		Tv tv2 = new Tv("Logitec", "무선 TV", 17);
		System.out.println("제조사 : " + tv2. company);
		System.out.println("모델명 : " + tv2.model);
		System.out.println("채널 : " + tv2.channel);
		System.out.println("-".repeat(40));
	}

}
