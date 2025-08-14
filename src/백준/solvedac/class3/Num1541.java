package 백준.solvedac.class3;

import java.io.*;

public class Num1541 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");

        int result = 0;

        for(int i=0; i<input.length; i++){
            String[] newInput = input[i].split("\\+");

            int sum = 0;
            for(int j=0; j<newInput.length; j++){
                sum += Integer.parseInt(newInput[j]);
            }

            if(i == 0) result = sum;
            else result -= sum;
        }

        System.out.println(result);
    }
}
