import java.util.Scanner;

public class Baek_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] classroom = new int[30];  // 배열 초기화
		int i;
		for (i = 0; i < 28; i++) {
			int check = Integer.parseInt(sc.nextLine());
			classroom[check - 1] = 1;
		}

		// 

		for (i = 0; i < 30; i++) {
			if (classroom[i] == 0) {
				System.out.println(i+1);
			}else {continue;}
		}

	}
}
