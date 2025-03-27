package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2920 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[8];

        for(int i=0; i<input.length; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";
        int firstNum = input[0] - '0';
        for(int i=1; i<input.length; i++){
            int num = input[i] - '0';

            if(num+1 == firstNum){
                firstNum--;
                result = "descending";
            }else if(num-1 == firstNum){
                firstNum++;
                result = "ascending";
            }else{
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}
