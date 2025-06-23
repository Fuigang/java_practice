import java.util.Scanner;

public class Baek_2675 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.nextLine();// 몇라인 만들지 설정
		
		

		for (int k = 0; k < testcase; k++) {
			String[] input = sc.nextLine().split(" "); // 
			int repeat = Integer.parseInt(input[0]);
			for (int j = 0; j < input[1].length(); j++) {
				for (int i = 0; i < repeat; i++) {
					System.out.print(input[1].charAt(j)); //
				}
			} System.out.println();
		}
	}
}
