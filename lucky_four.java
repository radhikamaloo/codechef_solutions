import java.util.Scanner;

public class lucky_four {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int T =s.nextInt();
            for(int i=0;i<T;i++)
            {
             int n=s.nextInt();
             int count=0;
             while(n>0)
             {
             if(n%10==4){
                 n=n/10;
                 count++;
             }
             else{
                 n=n/10;

             }
            }
                System.out.println(count);

            }
        }
        catch(Exception e)
        {
            return;
        }
}}
