import java.util.Scanner;

public class socks {
        public static void main(String[] args) {
            try {
                Scanner s = new Scanner(System.in);
                    int X = s.nextInt();
                    int A = s.nextInt();
                    int B = s.nextInt();
                    if(X==B||B==A||X==A)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
            } catch (Exception e) {
                return;
            }
        }
    }
