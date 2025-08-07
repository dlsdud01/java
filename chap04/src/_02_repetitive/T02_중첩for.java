package _02_repetitive;

public class T02_중첩for {

	public static void main(String[] args) {
		System.out.println("구구단 출력");
		/*
		for(int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j ++)
			{
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j ++)
			{
				System.out.printf("%d * %d = %d		", j, i, i*j);
			}
			System.out.println();
		}
		*/
		
		/*
		int end = 4;
		
		for (int first = 2; first <= 9; first+=3)
		{	
			for(int i = 1; i < 9; i++) {
				for (int j = first; j <= end; j ++)
				{
					System.out.printf("%d * %d = %d		", j, i, i*j);
				}
				System.out.println();
			}
			System.out.println();
			
			end += 3;
		}
		
		*/
		for (int start = 2; start <= 9; start += 3) {
		    int end = Math.min(start + 2, 9);

		    for (int i = 1; i <= 9; i++) {
		        for (int j = start; j <= end; j++) {
		            System.out.printf("%d * %d = %2d\t", j, i, j * i);
		        }
		        System.out.println();
		    }
		    System.out.println();
		}

	}

}
