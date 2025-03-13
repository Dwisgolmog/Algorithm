package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1463 {
    static Integer[] dp;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        dp = new Integer[num+1];
        dp[0] = dp[1] = 0;

        System.out.println(dp(num));
    }

    public static int dp(int num){

        if(dp[num] == null){
            if(num % 6 == 0){
                dp[num] = Math.min(dp(num/3),Math.min(dp(num/2),dp(num-1)))+1;
            }else if(num % 3 == 0){
                dp[num] = Math.min(dp(num / 3), dp(num - 1))+1;
            }else if(num % 2 == 0){
                dp[num] = Math.min(dp(num/2),dp(num-1))+1;
            }else{
                dp[num] = dp(num-1)+1;
            }
        }

        return dp[num];
    }

}