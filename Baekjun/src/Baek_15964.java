import java.util.Scanner;

public class Baek_15964 {

	public static long awesome(long a, long b) {
		
		long result = (a+b) *(a-b);
		return result;
	}

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long num1 = sc.nextInt();
		long num2 = sc.nextInt();

		long result = awesome(num1,num2);

		System.out.println(result);

	}
}
