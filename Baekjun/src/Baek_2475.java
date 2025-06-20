import java.util.Scanner;

public class Baek_2475 {

	public static String[] input() {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] unique_num = str.split(" ");
		return unique_num;
	}

	public static int validnum(String[] str, int num) {
		int sum = 0;
		int[] password = new int[5];
		for (int i = 0; i < str.length; i++) {
			password[i] = Integer.parseInt(str[i]);
			password[i] *= password[i];
		}
		for (int i = 0; i < password.length; i++) {

			sum += password[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		int[] password = new int[5];

		int real_num = 0;

		String[] num = input();
		// 스트링형 배열이 나왔어

		int result = validnum(num, num.length); // result 나왔어

		real_num = result % 10;

		System.out.println(real_num);

	}
}
