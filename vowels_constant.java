import java.util.Scanner;

public class vowels_constant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            char n = s.next().charAt(0);
            char x=Character.toUpperCase(n);
            if (x == 'A' || x == 'E' ||x == 'I' || x == 'O' || x == 'U' )
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
    }
}
