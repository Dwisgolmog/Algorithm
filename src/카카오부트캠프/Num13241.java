package 카카오부트캠프;

import java.io.*;

public class Num13241 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long num1 = Long.parseLong(input[0]);
        long num2 = Long.parseLong(input[1]);

        long gcd = GCD(num1,num2);

        System.out.println(num1*num2/gcd);

    }

    public static long GCD(long a,long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
