import java.io.IOException;
import java.util.Scanner;

public class busno {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if(n%5==0 || n%6==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        catch (Exception e) {
            return;

        }
    }}