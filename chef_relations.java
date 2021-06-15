import java.util.Scanner;

public class chef_relations {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int T =s.nextInt();
            for(int i=0;i<T;i++)
            {
               int a=s.nextInt();
                int b=s.nextInt();
                if (a==b)
                {
                    System.out.println("=");
                }
                else if(a>b)
                {
                    System.out.println(">");
                }
                else{
                    System.out.println("<");
                }

            }

        }
        catch (Exception e)
        {
            return;
        }

    }
}
