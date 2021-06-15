import java.io.IOException;
import java.util.Scanner;

public class print_odd {
    public static void main(String[] args) throws IOException {
        try
        {
            Scanner s= new Scanner(System.in);
            int L = s.nextInt();
            int R = s.nextInt();
            for(int i =L;i<=R;i++){
                if(i%2!=0){
                    System.out.println(i);
                }
            }
        }
        catch (Exception e){
            return;
        }
    }
}
