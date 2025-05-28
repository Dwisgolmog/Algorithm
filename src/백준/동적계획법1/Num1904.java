package 백준.동적계획법1;

import java.io.*;

public class Num1904 {

    static int[] memo;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo = new int[N+1];

        System.out.println(dp(N));
    }

    public static int dp(int N){
        if(N == 1) return memo[N] = 1;
        if(N == 2) return memo[N] = 2;
        if(memo[N] != 0) return memo[N];

        memo[N] = (dp(N-1) + dp(N-2)) % 15746;

        return memo[N];
    }
}
