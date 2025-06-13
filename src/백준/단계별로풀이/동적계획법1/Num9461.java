package 백준.단계별로풀이.동적계획법1;

import java.io.*;

public class Num9461 {

    static long[] memo;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(br.readLine());
            memo = new long[101];
            sb.append(dp(num)).append("\n");
        }
        System.out.println(sb);
    }

    public static long dp(int num){
        memo[1] = memo[2] = memo[3] = 1;
        memo[4] = memo[5] = 2;
        if(num <= 5) return memo[num];

        for(int i=6; i<=num; i++){
            memo[i] = memo[i-1] + memo[i-5];
        }

        return memo[num];
    }
}
