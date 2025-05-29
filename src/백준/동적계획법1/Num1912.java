package 백준.동적계획법1;

import java.io.*;
import java.util.*;

public class Num1912 {
    static int[] arr;
    static int[] dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[count];
        dp = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(dp(count));
    }

    public static int dp(int count){
        dp[0] = arr[0];
        int max = dp[0];

        for(int i=1; i<count; i++){
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);

            max = Math.max(max,dp[i]);
        }

        return max;

    }
}
