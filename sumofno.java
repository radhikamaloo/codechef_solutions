import java.io.IOException;
import java.util.Scanner;

public class sumofno {
    public static void main(String[] args) throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }
        catch (Exception e){
            return;
        }

    }}
