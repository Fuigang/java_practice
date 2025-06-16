import java.util.Scanner;

public class Baek_10807 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); // n개의 정수 받고
		String[] num = sc.nextLine().split(" ");// 정수 n개 입력
		int v = Integer.parseInt(sc.nextLine()); // 찾으려고 하는 정수
		for(int i = 0; i < n; i++) {
			if( v == Integer.parseInt(num[i])) {
				count++;
			}
			
		}
		
		
		System.out.println(count);
		
	}
}
