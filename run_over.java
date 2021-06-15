import java.io.IOException;
import java.util.Scanner;

public class run_over {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
                int R=s.nextInt();
                int O= s.nextInt();
                int C= s.nextInt();
                if((C+(20-O)*6*6)>R)
                    System.out.println("YES");
                else
                    System.out.println("NO");
}
        catch (Exception e) {
            return;
        }

    }}

