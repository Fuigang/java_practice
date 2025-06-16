import java.util.Scanner;

public class Baek_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int star = Integer.parseInt(sc.nextLine());

		int i,j;
		
		for (i = 0; i < star; i++) {
			
			for(j = 0;j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}
}
