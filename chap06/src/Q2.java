class Math {
	int max, min;
	int max(int ...arr) {
		max = arr[0];
		for (int i = 1; i < arr.length; i ++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	int min(int ...arr) {
		min = arr[0];
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
public class Q2 {

	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13, 3, 21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
