import java.io.IOException;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int t=s.nextInt();
            for(int i=0;i<t;i++){
               int n=s.nextInt();
                int result = sum(n);
                System.out.println(result);
            }
        }
        catch (Exception e){
            return;
        }
    }
    public  static int sum(int num){
        if(num==0) {
            return 1;
        }
        else{
            return(num*sum(num - 1));
        }
    }

}
