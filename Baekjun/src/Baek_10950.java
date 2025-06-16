import java.util.Scanner;

public class Baek_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int testcase = Integer.parseInt(sc.nextLine());

		while (testcase > i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			i++;

			System.out.println(a + b);
		}
	}
}
