import java.io.IOException;
import java.util.Scanner;

public class danish_n_pblm {
    public static void main(String[] args) throws IOException {
        try {
           Scanner s = new Scanner(System.in);
            int T = s.nextInt();
           while(T!=0){
                int[] arr = new int[10];
                for(int j=0;j<10;j++)
                {
                    arr[j]=s.nextInt();
                }
                int k=s.nextInt();
                int rem=0;

             for (int i=9;i>=0;i--){
               rem= k-arr[i];
                 k=rem;
                 if(rem<0) {
                     System.out.println(i+1);
                     break;
                 }
             }
             T--;

}
        } catch (Exception e) {
            return;
        }

    }}
