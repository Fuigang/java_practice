import java.util.Scanner;

public class Baek_2562 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[9];
		int max = 0;
		int pos = 0;
		for(int i = 0;i < input.length;i++) {
			input[i] = sc.nextInt();
			if(input[i] > max) {
				max = input[i];
				pos =  i+1;
			}
		}
		System.out.println(max);
		System.out.println(pos);
	}
}
