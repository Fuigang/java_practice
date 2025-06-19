import java.util.Scanner;

public class Baek_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            count++;
            if(count == 100) {break;}
        }
        
        sc.close();
    }
}
