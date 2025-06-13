package 백준.단계별로풀이.동적계획법1;

import java.io.*;

public class Num10844 {
    static Long[][] dp;
    static int mod = 1000000000;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new Long[N+1][10];

        for(int i=0; i<10; i++){
            dp[1][i] = 1L;
        }

        long result = 0L;
        for(int i=1; i<=9; i++){
            result += dp(N,i);
        }

        System.out.println(result%mod);
    }

    public static long dp(int N,int value){
        if(N == 1) return dp[N][value];

        if(dp[N][value] == null){
            if(value == 0){
                dp[N][value] = dp(N-1,1);
            }else if(value == 9){
                dp[N][value] = dp(N-1,8);
            }else{
                dp[N][value] = dp(N-1,value-1) + dp(N-1,value+1);
            }
        }

        return dp[N][value] % mod;
    }
}
