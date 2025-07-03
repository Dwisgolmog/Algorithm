package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num11053_2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[size];
        for(int i=0; i<size; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[size];
        for(int i=0; i<size; i++){
            dp[i] = 1;
            for(int j=i-1; j>=0; j--){
                if(input[i] > input[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int result = dp[0];
        for(int i=1; i<size; i++){
            if(result < dp[i]) result = dp[i];
        }

        System.out.println(result);
    }
}
