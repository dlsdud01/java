package _02_Array;

import java.util.Arrays;

public class T03_Q1 {

	public static void main(String[] args) {
		int score[] = {100, 98, 69, 79, 82};
		int sum = 0;
		double ave;
		
		for (int i = 0; i <score.length; i++) 
		{
			sum += score[i];
		}
		ave = sum / (double) score.length;
		
		System.out.printf("총점 : %d, 평균 : %.1f\n", sum, ave);
		
		System.out.println("------------------------------------");
		
		int num[] = {27, 89, 92, 16, 9, 109, 29, 3, 32, 45};
		int max = num[0];
		int min = num[0];
		
		for(int i = 1; i <num.length; i++) {
			if(max<num[i]) {
				max = num[i];
			}
			if(min>num[i]) {
				min = num[i];
			}
		}
		System.out.printf("최댓값 : %d, 최솟값 : %d\n", max, min);
		
		System.out.println("------------------------------------");
		
		int ran[] = new int[10];
		
		for(int i =0; i<ran.length; i++)
		{
			ran[i] = (int)((Math.random() * 100)+1);
		}
		System.out.print(Arrays.toString(ran));
	}

}
