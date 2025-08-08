package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Q1");
		
		int arr1[] = new int[10];
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = i + 1;
		}
		System.out.print(Arrays.toString(arr1));
		
		System.out.println();
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ2");
		
		int arr2[] = new int[10];
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = arr2.length - i;
		}
		System.out.print(Arrays.toString(arr2));
		
		System.out.println();
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ3");
		
		System.out.print("배열 크기 입력 : ");
		int len1 = sc.nextInt();
		
		int arr3[] = new int[len1];
		for(int i = 0; i < arr3.length; i++)
		{
			arr3[i] = i + 1;
		}
		System.out.print(Arrays.toString(arr3));
		
		System.out.println();
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ4");
		
		String arr4[] = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.print(arr4[1]);
		
		System.out.println();
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ5");
		
		int cnt = 0;
		
		System.out.print("문자열 입력 : ");
		String s1 = sc.next();
		System.out.print("문자 입력 : ");
		String s2 = sc.next();
		String arrs1[] = new String[s1.length()];
		
		for(int i = 0; i < s1.length(); i++)
		{
			arrs1[i] = String.valueOf(s1.charAt(i));
		}
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) :");
		
		for(int i = 0; i < arrs1.length; i++)
		{
			if (arrs1[i].equals(s2))
			{
				System.out.print(" "+ i);
				cnt++;
			}
		}
		System.out.printf("\n%s갯수 : %d\n", cnt);
		
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ6");
		
		String week[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int day = sc.nextInt();
		
		if(day >=0 && day<7)
		{
			System.out.println(week[day]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ7");
		
		int sum = 0;
		
		System.out.print("배열 크기 입력 : ");
		int len2 = sc.nextInt();
		int arr5[] = new int[len2];
		
		for(int i = 0; i<len2; i++)
		{
			System.out.printf("%d번 숫자 : ", i+1);
			arr5[i] = sc.nextInt();
			sum += arr5[i];
		}
		System.out.println("합계 : " + sum);
		
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ8");

		int num;

		while (true) {
		    System.out.print("정수 : ");
		    num = sc.nextInt();

		    if (num%2 == 1) {
		        break;
		    }

		    System.out.println("다시 입력하세요.");
		}

		int[] arr8 = new int[num];
		int mid = num / 2;

		for (int i = 0; i <= mid; i++) {
		    arr8[i] = i + 1;
		}
		for (int i = mid + 1; i < num; i++) {
		    arr8[i] = num - i;
		}

		System.out.println(Arrays.toString(arr8));

		
		System.out.print("-".repeat(40));
		
		System.out.println("\nQ9");
		
		String chicken[] = {"불닭", "후라이드", "양념", "간장", "마늘"};

		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.next();

		boolean found = false;

		for (int i = 0; i < chicken.length; i++) {
		    if (chicken[i].equals(menu)) {
		        found = true;
		        break;
		    }
		}

		if (found) {
		    System.out.printf("%s치킨 배달 가능\n", menu);
		} else {
		    System.out.printf("%s치킨은 없는 메뉴입니다.\n", menu);
		}

		
		System.out.print("-".repeat(40));
		
		System.out.println("\n10");
		
		int ran[] = new int[10];
		
		for(int i = 0; i < ran.length; i++)
		{
			ran[i] = (int)(Math.random()*10 + 1);
		}
		
		int min = ran[0];
		int max = ran[0];
		
		for(int i = 1; i < ran.length; i++)
		{	
			if(min>ran[i])
				min = ran[i];
		}
		for(int i = 1; i < ran.length; i++)
		{	
			if(max<ran[i])
				max = ran[i];
		}
		
		System.out.println(Arrays.toString(ran));
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);
		
		System.out.print("-".repeat(40));
		
		System.out.println("\n11");
		
		int arr11[] = new int[5];
		for(int i = 0; i < arr11.length; i++)
		{
			System.out.print("정수 입력 : ");
			arr11[i] = sc.nextInt();
		}
		for(int i = 0; i < arr11.length; i++)
		{
			int index = arr11[i];
			for(int j = i + 1; j < arr11.length; j++) {
				if(index > arr11[j])
				{
					arr11[i] = arr11[j];
					arr11[j] = index;
					index = arr11[i];
				}
			}
		}
		System.out.print(Arrays.toString(arr11));
		
		
		System.out.print("-".repeat(40));
		System.out.println("\n12");

		System.out.print("학생 수 입력 : ");
		int child = sc.nextInt();
		int std[][] = new int[child][3]; // 과목만큼 칸
		String sub[] = {"국어", "영어", "수학"};

		// 점수 입력
		for (int i = 0; i < child; i++) {
		    for (int j = 0; j < sub.length; j++) {
		        System.out.printf("%d번 학생 %s 점수 : ", (i + 1), sub[j]);
		        std[i][j] = sc.nextInt();
		    }
		}

		// 과목별 총점 저장용
		int[] subSum = new int[sub.length];

		// 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(40));

		for (int i = 0; i < child; i++) {
		    int sum12 = 0; // 🔹 sum → sum12

		    System.out.printf("%d\t", (i + 1));
		    for (int j = 0; j < sub.length; j++) {
		        System.out.printf("%d\t", std[i][j]);
		        sum12 += std[i][j];
		        subSum[j] += std[i][j];
		    }
		    double avg = sum12 / (double) sub.length;
		    System.out.printf("%d\t%.1f\n", sum12, avg);
		}

		System.out.println("-".repeat(40));

		// 과목별 총점
		System.out.print("총점\t");
		for (int j = 0; j < sub.length; j++) {
		    System.out.printf("%d\t", subSum[j]);
		}
		System.out.println();

		// 과목별 평균
		System.out.print("평균\t");
		for (int j = 0; j < sub.length; j++) {
		    System.out.printf("%.1f\t", subSum[j] / (double) child);
		}
		System.out.println();

	}
	
	

}
