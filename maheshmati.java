import java.io.IOException;
import java.util.Scanner;

public class maheshmati {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            int even=0,odd=0;
            for(int i=0;i<T;i++){
                int n = s.nextInt();
               for (int j=0;j<n;j++)
               {
                if(n%2==0)
                {
                    even+=1;
                }
                else{
                    odd+=1;
                }
            }
            if(even>odd)
            {
                System.out.println("READY FOR BATTLE");
            }
            else {
                System.out.println("NOT READY");
            }
        }}
        catch (Exception e) {
            return;
        }
    }}
