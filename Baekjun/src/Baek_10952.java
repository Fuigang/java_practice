import java.util.Scanner;

public class Beak_10952 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		
		while(true) {
			String[] arr = sc.nextLine().split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			
			
			if(a==0 && b == 0) {
				break;
			}
			System.out.println(a+b);
		}
		
		
	}
}
