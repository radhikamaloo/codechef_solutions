import java.io.IOException;
import java.util.Scanner;

public class addno {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            long N = s.nextInt();
            System.out.println(N*(N+1)/2);
        }
        catch (Exception e)
        {
            return;
        }
}}
