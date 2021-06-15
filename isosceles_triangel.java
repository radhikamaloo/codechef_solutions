import java.io.IOException;
import java.util.Scanner;

public class isosceles_triangel {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            while(T-->0){
                int b=s.nextInt();
                int area= (int) (0.5*b*b);
               int sqr = area/4;
                System.out.println(sqr);

            }
}catch (Exception e) {
        return;
    }
}
}
