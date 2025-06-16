import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcase; i++) {
			String[] input = br.readLine().split(" ");
			int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
			bw.write(String.valueOf(sum));
			bw.newLine();

		}
		bw.flush();
	}
}
