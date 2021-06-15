import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bank_hijack {
        static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader()
            {
                br = new BufferedReader(
                        new InputStreamReader(System.in));
            }

            String next()
            {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() { return Integer.parseInt(next()); }

            long nextLong() { return Long.parseLong(next()); }

            double nextDouble()
            {
                return Double.parseDouble(next());
            }

            String nextLine()
            {
                String str = "";
                try {
                    str = br.readLine();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }
    public static void main(String[] args) throws IOException {
        try {
            FastReader s = new FastReader();
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int D = s.nextInt();
                int d = s.nextInt();
                int P = s.nextInt();
                int Q = s.nextInt();
                long sum;
               long n=D/d;
               if(D%d==0)
               {
                   sum=(P*n+Q*((n-1)*n)/2)*d;
               }
               else
               {
                  long sum1=(P*n+Q*(n-1)*(n)/2)*d;
                   sum=sum1+(D%d)*(P+n*Q);
               }
               System.out.println(sum);

}}
            catch(Exception e){
                return;
            }

        }
    }
