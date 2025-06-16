import java.util.Scanner;

public class Baek_10872 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int fac_N = Integer.parseInt(sc.nextLine());
		
		
		
		int i = fac_N;
		
		while( i > 1) {
			i--;
			fac_N = fac_N * i;
		}
		
		if (fac_N == 0) {
			System.out.println(fac_N+1);	
		} else {
			System.out.println(fac_N);}
		
	}
}
