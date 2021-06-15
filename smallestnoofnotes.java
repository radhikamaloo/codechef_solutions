import java.io.IOException;
import java.util.Scanner;

public class smallestnoofnotes {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            int notes=0;
            for (int i=0;i<T;i++){
                int n=s.nextInt();
                while(n!=0)
                {
                    if(n>=100)
                    {
                        notes++;
                        n=n-100;
                    }
                    else if (n>=50)
                    {
                        notes++;
                        n=n-50;
                    }
                    else if (n>=10)
                    {
                        notes++;
                        n=n-10;
                    }
                    else if (n>=10)
                    {
                        notes++;
                        n=n-10;
                    }
                    else if (n>=5)
                    {
                        notes++;
                        n=n-5;
                    }
                    else if (n>=2)
                    {
                        notes++;
                        n=n-2;
                    }
                    else if (n>=1)
                    {
                        notes++;
                        n=n-1;
                    }
                }
                System.out.println(notes);
            }
        } catch (Exception e) {
            return;
        }
    }
}