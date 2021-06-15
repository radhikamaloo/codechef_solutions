import java.util.Scanner;

public class baloonprblm {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                String str=s.next();
                int A=0,B=0;
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(j)=='a')
                        A=A+1;
                    else
                        B=B+1;
                }
                if(A==B)
                    System.out.println(A);
                else if(A==0 || B==0)
                    System.out.println(0);
                else if(A>B)
                    System.out.println(B);
                else
                    System.out.println(A);


            }
        } catch (Exception e) {
            return;
        }
    }}

