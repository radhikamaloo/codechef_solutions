import java.io.IOException;
import java.util.Scanner;

public class coconut_challenge {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int xa = s.nextInt();
                int xb = s.nextInt();
                int Xa = s.nextInt();
                int Xb = s.nextInt();
                int sum1=Xa/xa;
                int sum2=Xb/xb;
                System.out.println(sum1+sum2);

            }}
 catch(Exception e){
                return;
            }

        }
    }
