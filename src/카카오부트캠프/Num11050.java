package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num11050 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(fac(N) / (fac(N - K) * fac(K)));
    }

    public static int fac(int num){
        int result = 1;

        for(int i=1; i<=num; i++){
            result *= i;
        }

        return result;
    }
}
