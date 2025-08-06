package 백준.solvedac.class3;

import java.io.*;

public class Num11726 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] dp = new int[size+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=size; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }

        System.out.println(dp[size]);
    }
}
