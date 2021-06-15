import java.util.Scanner;

public class flatland {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int N= sc.nextInt();
                int count=0;
                while(N>0)
                {
                   int s = (int) Math.sqrt(N);
                   count+=1;
                   N=N-(s*s);
                }
                System.out.println(count);
            }
        }
        catch(Exception e)
        {
            return;
        }
    }}
