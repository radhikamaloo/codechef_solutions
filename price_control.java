import java.io.IOException;
import java.util.Scanner;

public class price_control {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            while(T-->0){
                int n=s.nextInt();
                int k=s.nextInt();
                int a[]=new int[n];
                int sum=0;
                for(int i=0;i<n;i++) {
                    a[i] = s.nextInt();
                    if(a[i]>k)
                        sum+=(a[i]-k);
                }
                System.out.println(sum);
}}catch (Exception e) {
        return;
    }
}
}

