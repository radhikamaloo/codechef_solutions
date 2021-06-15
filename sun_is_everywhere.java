import java.io.IOException;
import java.util.Scanner;

public class sun_is_everywhere {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int even = n*(n-1) ;
            int odd = n*n;
            System.out.print(odd+" "+even);



        } catch (Exception e) {
            return;
        }
    }}