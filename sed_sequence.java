import java.io.IOException;
import java.util.Scanner;

public class sed_sequence {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            for(int j=0;j<T;j++){
                int n=s.nextInt();
                int k=s.nextInt();
                int sum=0;
                for(int i=0;i<n;i++) {
                    sum+= s.nextInt();
                }
                if(sum%k==0)
                    System.out.println(0);
                else
                    System.out.println(1);

            }}catch (Exception e) {
            return;
        }
    }
}
