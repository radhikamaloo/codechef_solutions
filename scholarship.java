import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
                int R= sc.nextInt();
                if(R>=1&&R<=50)
                    System.out.println(100);
                else if(R>=51&&R<=100)
                    System.out.println(50);
                else
                    System.out.println(0);

        }
        catch(Exception e)
        {
            return;
        }
    }}
