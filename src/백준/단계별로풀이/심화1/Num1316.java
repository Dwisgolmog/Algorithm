package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1316 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int count =0;

        for(int i=0; i<repeat; i++){
            boolean[] check = new boolean[26];
            String inputStr = br.readLine();
            int checkNum = 0;
            int prev =-1;

            for(int j=0; j<inputStr.length(); j++){
                int num = inputStr.charAt(j) - 97;

                if(prev != num){
                    prev = num;
                    if(!check[num]){
                        check[num] = true;
                        checkNum++;
                    }
                }else{
                    checkNum++;
                }
            }
            if(checkNum == inputStr.length()) count++;
        }

        System.out.println(count);
    }
}
