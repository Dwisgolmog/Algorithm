package 백준.배열_1차원;

import java.io.*;

public class Num1475 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();
        int result = 0;

        int num[] = new int[10];
        for(int i=0; i<inputNum.length(); i++){
            int number = inputNum.charAt(i)-'0';
            num[number]++;
        }

        num[6] = num[9] = (num[6] + num[9] + 1) /2;

        for(int count:num){
            result = Math.max(result,count);
        }

        System.out.println(result);
    }
}
