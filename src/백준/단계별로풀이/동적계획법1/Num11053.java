package 백준.단계별로풀이.동적계획법1;

import java.io.*;
import java.util.*;

public class Num11053 {

    static int[] list;
    static int[] dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        list = new int[count];
        dp = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int result =0;
        for(int i=0; i<count; i++){
            result = Math.max(result,LIS(i));
        }
        System.out.println(result);
    }

    public static int LIS(int N){

        if(dp[N] == 0){
            dp[N] = 1;

            for(int i=N-1; i >= 0; i--){
                if(list[i] < list[N]){
                    dp[N] = Math.max(dp[N],LIS(i) + 1);
                }
            }
        }

        return dp[N];
    }
}
