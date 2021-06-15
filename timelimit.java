import java.util.Scanner;

public class timelimit {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T =s.nextInt();
            for(int i=0;i<T;i++) {
                int x = s.nextInt();
                int m = s.nextInt();
                int d = s.nextInt();
                if (x * m == x + d)
                    System.out.println(x * m);
                else if (x * m > x + d)
                    System.out.println(x+d);
                else
                    System.out.println(x * m);
            }
    } catch (Exception e) {
        return;
    }
}
    }
