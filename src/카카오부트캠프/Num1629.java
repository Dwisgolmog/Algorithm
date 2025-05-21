package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1629 {

    static long C;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(a,b));

    }

    public static long pow(long base,long exponent){
        if(exponent == 1){
            return base % C;
        }

        long temp = pow(base,exponent/2);

        if(exponent % 2 == 1){
            return (temp * temp % C) * base % C;
        }

        return temp * temp % C;
    }
}
