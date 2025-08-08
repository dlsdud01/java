package _02_Array;

import java.util.Arrays;

public class T05_lotto {

	public static void main(String[] args) {
		int arr[] = new int[45];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < 6; i ++)
		{
			
			int num = (int)(Math.random() * 45);
			
			int store = arr[i];
			arr[i] = arr[num];
			arr[num] = store;
		}
		
		System.out.print("로또 번호 : ");
		
		for(int i = 0; i < 6; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
