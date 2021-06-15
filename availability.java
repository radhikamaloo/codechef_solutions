import java.io.IOException;
import java.util.Scanner;

public class availability {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int H=s.nextInt();
                int x= s.nextInt();
                int y= s.nextInt();
                int C =s.nextInt();
                if((x+y/2)*H<=C)
                    System.out.println("YES");
                else
                    System.out.println("NO");
}
        } catch (Exception e) {
            return;
        }

    }}
