import java.io.IOException;
import java.util.Scanner;

public class hoop_game {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int H = s.nextInt();
                System.out.println((H+1)/2);
            }
        }  catch (Exception e) {
                return;
            }

        }}
