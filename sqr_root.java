import java.io.IOException;
import java.util.Scanner;

public class sqr_root {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
            int n = s.nextInt();
              double sqr= (Math.sqrt(n));

                System.out.println(Math.ceil(sqr));
            }
        } catch (Exception e) {
            return;
        }
    }}