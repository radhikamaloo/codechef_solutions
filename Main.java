import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int n = s.nextInt();
            Integer[] arr ={2010, 2015, 2016, 2017,2019};
            boolean year = Arrays.asList(arr).contains(n);
            if(year==true)
            {
                System.out.println("HOSTED");
            }
            else
            {
                System.out.println("NOT HOSTED");
            }

        }

    }
        catch(Exception e)
        {
            return;
        }
}}