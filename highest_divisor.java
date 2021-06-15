import java.io.IOException;
import java.util.Scanner;

public class highest_divisor {
    public static void main(String[] args) throws IOException {
      try {
        Scanner s = new Scanner(System.in);
       // int T =s.nextInt();
          int max=0;
          int arr[]={1,2,3,4,5,6,7,8,9,10};
          int n=s.nextInt();
        for(int i=0;i<10;i++)
        {
                if(n%arr[i]==0){
                    max=arr[i];
                }
}
        System.out.println(max);
    } catch (Exception e) {
       // return;
    }
}}
