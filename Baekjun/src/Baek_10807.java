import java.util.Scanner;

public class Baek_10807 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] v = null;
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextLine(); // 이게 맞나?
		}
		System.out.println(v);
		
	}
}
