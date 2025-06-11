package 백준.동적계획법1;

import java.io.*;
import java.util.*;

public class Num2565 {

    static int[][] line;
    static int[] dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        line = new int[N][2];
        dp = new int[N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(line, (a, b) -> Integer.compare(a[0], b[0]));

        int result = 0;

        for(int i=0; i<N; i++){
            result = Math.max(LIS(i), result);
        }

        System.out.println(N - result);
    }

    public static int LIS(int N){

        if(dp[N] == 0){
            dp[N] = 1;

            for(int i=N+1; i<line.length; i++){
                if(line[N][1] < line[i][1]){
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }
        }

        return dp[N];
    }
}
