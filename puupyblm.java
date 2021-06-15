import javax.imageio.stream.ImageInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class puupyblm {
        public static void main(String[] args)
         {
                Scanner s = new Scanner(System.in);
                int T = s.nextInt();
                for (int i = 0; i < T; i++) {
                   int D = s.nextInt();
                  int  N = s.nextInt();
                    System.out.println(sum(D, N));
                }
                s.close();

        }
            static int sum( int D,int N) {
                //  return (N*(N+1)/2);
                int add = 0;
                for(int j=0;j<D;j++) {
                    add = (N * (N + 1) )/ 2;
                    N = add;
                }
                return add;
            }
        }
