package 백준.동적계획법1;

import java.io.*;

public class Num2156 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] list = new int[count+1];
        int[] dp = new int[count+1];

        for(int i=1; i<=count; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = list[1];
        if(count > 1) dp[2] = list[1] + list[2];

        for(int i=3; i<=count; i++){
            dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+list[i],dp[i-3]+list[i]+list[i-1]));
        }

        System.out.println(dp[count]);
    }
}
