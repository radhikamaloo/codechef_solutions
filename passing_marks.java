import java.io.IOException;
import java.util.Scanner;

public class passing_marks {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            while(T!=0){
                int Amin=s.nextInt();
                int Bmin=s.nextInt();
                int Cmin=s.nextInt();
                int Tmin=s.nextInt();
                int A=s.nextInt();
                int B=s.nextInt();
                int C=s.nextInt();
                if(A>=Amin && B>=Bmin && C>=Cmin && (Amin+Bmin+Cmin>=Tmin))
                    System.out.println("yes");
                else
                    System.out.println("no");
                T--;
            }
}
        catch (Exception e) {
            return;
        }
    }
}
