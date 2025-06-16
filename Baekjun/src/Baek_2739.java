import java.util.Scanner;

public class Baek_2739 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int i = 0;

		while (i < 9) {
			i++;
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
