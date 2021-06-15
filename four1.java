import java.util.Scanner;

public class four1 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N= s.nextInt();
                int count=0;
                while(N!=0)
                {
                    if(N%10==4)
                        count +=1;
                        N=N/10;
                }
                System.out.println(count);
            }
        }
            catch(Exception e)
            {
                return;
            }
        }}