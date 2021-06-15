import java.io.IOException;
import java.util.Scanner;

public class first_last {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            int first=0,last=0;
            for (int i = 0; i < T; i++) {
                int n = s.nextInt();
                first = n % 10;
                while (n > 10) {
                    n = n / 10;
                }
                last = n;
                System.out.println(first + last );
            }

        } catch (Exception e) {
            return;
        }
    }}


