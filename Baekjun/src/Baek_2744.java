import java.util.Scanner;

public class Baek_2744 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		// charAt 쓰고 대문자면 소문자로바꾸고 소문자면 소문자로 바꾸기
		String word = sc.nextLine();

		for (int i = 0; i < word.length(); i++) {

			if (Character.isUpperCase(word.charAt(i))) {
				 sb.append(Character.toLowerCase(word.charAt(i)));
			}
			else if(Character.isLowerCase(word.charAt(i))) {
				sb.append(Character.toUpperCase(word.charAt(i)));
			}
		}
		System.out.println(sb.toString());
	}
}
