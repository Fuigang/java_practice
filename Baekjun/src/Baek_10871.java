import java.util.Scanner;

public class Baek_10871 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" "); // n과 x 구해주기
		
		

		int n = Integer.parseInt(input[0]); // 배열 갯수
		int x = Integer.parseInt(input[1]); // 얘보다 작은 원수 갯수
		
		while(true) {
		String[] number = sc.nextLine().split(" "); // 여기서 원소 갯수를 어캐 정하니
		if(number.length == n) {
			for(int i = 0;i < number.length;i++) {
				
				if(x > Integer.parseInt(number[i])) {
					System.out.print(number[i] + " ");
				}
				
			}
			break;
		}else {
			System.out.print("원소 다시 입력 ");
		}
		
		}
		
	
		
		
		
	}
}