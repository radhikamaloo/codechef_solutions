import java.io.IOException;
import java.util.Scanner;

public class chef_on_island {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int x = s.nextInt();
                int y = s.nextInt();
                int xr = s.nextInt();
                int yr=s.nextInt();
                int D =s.nextInt();
                if(xr*D<=x && yr*D<=y)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
        catch (Exception e) {
                return;
            }

        }}
