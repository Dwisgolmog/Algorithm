package 백준.solvedac.class3;

import java.io.*;

public class Num11727 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] dp = new int[count];

        if(count == 1) {
            System.out.println(1);
            return;
        }else if(count == 2){
            System.out.println(3);
            return;
        }
        dp[0] = 1;
        dp[1] = 3;

        for(int i=2; i<count; i++){
            dp[i] = (dp[i-1] + dp[i-2] * 2) % 10007;
        }

        System.out.println(dp[count-1]);
    }
}
