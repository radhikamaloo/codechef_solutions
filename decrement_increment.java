import java.io.IOException;
import java.util.Scanner;

public class decrement_increment {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int n = s.nextInt();
            if(n%4==0){
                n=n+1;
            }
            else{
                n=n-1;
            }
            System.out.println(n);

        }
        catch (Exception e) {
            return;
        }
    }}

