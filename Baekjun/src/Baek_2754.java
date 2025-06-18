import java.util.Scanner;

public class Baek_2754 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String apb_score = sc.nextLine();
		float score = 0.0f;
		float cpr = 0.3f;

		if (apb_score.equals("F")) {
			
		} else {
			switch (apb_score.charAt(0)) {
			case 'A':
				score = 4.0f;
				break;
			case 'B':
				score = 3.0f;
				break;
			case 'C':
				score = 2.0f;
				break;
			case 'D':
				score = 1.0f;
				break;
			default:
				break;
			}

		}
		if (apb_score.length() == 2) {
			switch (apb_score.charAt(1)) {
			case '+':
				score += cpr;
				break;
			case '-':
				score -= cpr;
				break;
			default:
				break;
			}
		}
		System.out.println(score);

	}
}
