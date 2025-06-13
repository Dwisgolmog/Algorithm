package 백준.단계별로풀이.브루트포스;

import java.io.*;

public class Num2231 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int inputNum = Integer.parseInt(input);
        int result = 0;

        for(int i=inputNum-(input.length()*9); i<inputNum; i++){
            String strI = String.valueOf(i);

            int num =0;
            for(int j=0; j<strI.length(); j++){
                num+= strI.charAt(j) - '0';
            }


            if(num+i == inputNum) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
