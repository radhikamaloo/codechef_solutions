import java.io.IOException;
import java.util.Scanner;

public class sum_difference {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            if (n1 > n2) {
                int diff = n1 - n2;
                System.out.println(diff);
            } else {
                int sum = n1 + n2;
                System.out.println(sum);
            }
        } catch (Exception e) {
            return;
        }
    }
}