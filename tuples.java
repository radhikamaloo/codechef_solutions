import java.io.IOException;
import java.util.Scanner;

public class tuples {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();
                int M = s.nextInt();
                int count=0;
                int power= (int) Math.pow(2,M);
                for(int j=0;i<(power-1);j++) {
                    for (int k = 0; k< (power-1); k++) {
                        if(true) {
                            count += 1;
                        }
                    }
                }
                System.out.println(count);


            }
        } catch (Exception e) {
            return;
        }
    }}



