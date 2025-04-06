package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num11050_2 {

    static int[][] dp;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];

        dp(N,K);
        System.out.println(dp[N][K]);
    }

    static void dp(int N,int K){
        for(int i=0; i<=N; i++){
            for(int j=0; j<=Math.min(i,K); j++){
                if(j == 0 || j == i){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }
    }
}
