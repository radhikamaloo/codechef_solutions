import java.io.IOException;
import java.util.Scanner;

public class playing_mathches {
    public static void main(String[] args) throws IOException {
        try {
            int[]arr={6,2,5,5,4,5,6,3,7,6};
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            while(T!=0)
            {
                int a=s.nextInt();
                int b=s.nextInt();
                int c=a+b;
                int sum=0;
                while(c!=0)
                {
                    int rem=c%10;
                  sum+=arr[rem]  ;
                  c=c/10;
                }
                System.out.println(sum);
                T--;
            }

}catch (Exception e) {
            return;
        }
    }
}
