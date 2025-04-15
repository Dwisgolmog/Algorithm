package 카카오부트캠프;

import java.io.*;

public class Num1003 {
    static int[][] dp = new int[41][2];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] list = new int[count][2];
        for(int i=0; i<count; i++){
            list[i] = dp(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();
        for(int[] value: list){
            sb.append(value[0]).append(" ").append(value[1]).append("\n");
        }
        System.out.println(sb);
    }

    static int[] dp(int num){

        if(num == 0) return new int[] {1,0};
        else if(num == 1) return new int[] {0,1};

        int[] num1;
        int[] num2;

        if((dp[num-1][0] > 0 || dp[num-1][1] > 0) && (dp[num-2][0] > 0 || dp[num-2][1] > 0)){
            num1 = dp[num-1];
            num2 = dp[num-2];
        }else{
            num1 = dp(num-1);
            num2 = dp(num-2);
        }

        dp[num] = new int[]{num1[0] + num2[0], num1[1] + num2[1]};
        return new int[] {dp[num][0],dp[num][1]};
    }
}
