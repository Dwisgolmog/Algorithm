package 백준.단계별로풀이.동적계획법1;

import java.io.*;

public class Num9251 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        int[][] dp = new int[str2.length+1][str1.length+1];

        for(int i=1; i<=str1.length; i++){
            for(int j=1; j<=str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    dp[j][i] = dp[j-1][i-1] + 1;
                }else{
                    dp[j][i] = Math.max(dp[j-1][i],dp[j][i-1]);
                }
            }
        }

        System.out.println(dp[str2.length][str1.length]);
    }
}
