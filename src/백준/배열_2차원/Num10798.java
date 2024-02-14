package 배열_2차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10798 {
    public static void main(String[] args)throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = new String[5];
        int maxLength = 0;

        for(int i=0; i<5; i++){
            inputStr[i] =  br.readLine();
            if(maxLength < inputStr[i].length()) maxLength = inputStr[i].length();
        }

        for(int i=0; i<maxLength; i++){
            for(int c=0; c<5; c++){
                if(inputStr[c].length() > i){
                    sb.append(inputStr[c].charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}
