import java.io.IOException;
import java.util.Scanner;

public class squre_of_odd_length {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            while(T!=0) {
                int N = s.nextInt();
                int sum=0;
                for (int i=1;i<=N;i+=2 )
                {
                    int squ=(N-i+1)*(N-i+1);
                    sum= sum+squ;
                }
                System.out.println(sum);

}}
             catch (Exception e) {
                return;
            }

        }}
