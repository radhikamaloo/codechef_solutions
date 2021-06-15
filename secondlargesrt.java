import java.io.IOException;
import java.util.Scanner;

public class secondlargesrt{
        public static void main(String[] args) throws IOException {
            try {
                Scanner s = new Scanner(System.in);
                int T = s.nextInt();
                for (int i = 0; i < T; i++) {
                    int x = s.nextInt();
                    int y = s.nextInt();
                    int z = s.nextInt();
                    int second_largest = (x > y) ? (x > z ? ((y > z) ? y : z) : (x > z ? z : x)) : (y > z ? ((x > z) ? x : z) : (y> z) ? z : y);
                    System.out.println(second_largest);


                }
            } catch (Exception e) {
                return;
            }

        }}