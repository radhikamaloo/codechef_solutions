import java.io.IOException;
import java.util.Scanner;

public class both_or_not {
    public static void main(String[] args) throws IOException{
        try{
            Scanner s = new Scanner(System.in);
            int n= s.nextInt();
            if(n%5==0 && n%11==0)
            {
                System.out.println("BOTH");
            }
            else if (n%5==0 || n%11==0){
                System.out.println("ONE");
            }
            else{
                System.out.println("NONE");
            }
        }
        catch (Exception e){
            return;
        }

    }
}
