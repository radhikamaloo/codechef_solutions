import java.io.IOException;
import java.util.Scanner;

public class body_mass_index {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T=s.nextInt();
            for(int i=0;i<T;i++)
            {
                int M=s.nextInt();
                int H=s.nextInt();
                int BMI=M/(H*H);
                if(BMI<=18)
                    System.out.println("1");
                else if (BMI>18&&BMI<25)
                    System.out.println("2");
                else if (BMI>24&& BMI<30)
                    System.out.println("3");
                else if(BMI>=30)
                    System.out.println("4");
            }
} catch (Exception e) {
            return;
        }

    }}
