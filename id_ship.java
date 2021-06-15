import java.io.IOException;
import java.util.Scanner;

public class id_ship {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            char x = s.next().charAt(0);
            if (x == 'B' || x == 'b')
                System.out.println("BattleShip");
            else if (x == 'C' || x == 'c')
                System.out.println("Cruiser");
            else if (x == 'D' || x == 'd')
                System.out.println("Destroyer");
            else if (x == 'F' || x == 'r')
                System.out.println("Frigate");
        }
    }
}