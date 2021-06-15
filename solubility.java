import java.util.Scanner;

public class solubility {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int X = s.nextInt();
                int A = s.nextInt();
                int B = s.nextInt();
                int solubilityat100 =A+(100-X)*B;
                int for10 = solubilityat100*10;
                System.out.println(for10);
            }}
catch(Exception e)
            {
                return;
            }
        }
    }
