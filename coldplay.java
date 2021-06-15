import java.util.Scanner;

public class coldplay {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int M = s.nextInt();
                int S = s.nextInt();
                int time = M / S;
                System.out.println(time);
            }
        } catch (Exception e) {
            return;
        }
    }}