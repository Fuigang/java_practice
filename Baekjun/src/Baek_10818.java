import java.util.Scanner;

public class Baek_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 정수의 개수 입력
		int[] arr = new int[input];
		
		int max = -1000001;
		int min = 1000001;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			} 
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println(min + " " + max);
		
		
	}
}
