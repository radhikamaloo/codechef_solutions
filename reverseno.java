import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T =s.nextInt();
            for(int i=0;i<T;i++)
            {
                int n=s.nextInt();
                while(n!=0)
                {
                   int m=n %10;
                   n=n/10;
                    System.out.print(m);
                }
            }
        } catch (Exception e) {
                return;
        }
    }}