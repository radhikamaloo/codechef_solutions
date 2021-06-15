import java.io.BufferedReader;
import java.util.Scanner;

public class twovsten {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                Scanner br = new Scanner(System.in);
                long x = s.nextInt();
                int count=0;
                if(x==0)
                    System.out.println(-1);
                else if(x%5==0)
                {
                  while(x%10!=0)
                  {
                      count+=1;
                      x*=2;
                  }
                    System.out.println(count);
                }
                else
                {
                    System.out.println(-1);
                }
        }}
            catch(Exception e){
                return;
            }
        }}
