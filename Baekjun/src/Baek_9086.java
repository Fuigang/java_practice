import java.util.Scanner;

public class Baek_9086 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.nextLine();
		String[] input = new String[testcase];  
		for(int i = 0; i < testcase;i++) {
			input[i] = sc.nextLine();
		}
		
		
		for(int i = 0;  i < input.length;i++) {
			System.out.print(input[i].charAt(0));

			System.out.println(input[i].charAt(input[i].length() - 1));}
		
		
	}
}
