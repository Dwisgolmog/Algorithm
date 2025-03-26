package 카카오부트캠프;

import java.io.*;

public class Num2579 {

    static Integer dp[];
    static int list[];

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        list = new int[count+1];
        dp = new Integer[count+1];

        for(int i=1; i<count+1; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = list[0];
        dp[1] = list[1];

        if(count >= 2){
            dp[2] = list[1] + list[2];
        }

        System.out.println(climb(count));
    }

    static int climb(int step){

        if(dp[step] == null){
            dp[step] = Math.max(climb(step-3)+list[step-1],climb(step-2)) + list[step];
        }

        return dp[step];
    }

}
