package 백준.브루트포스;

import java.io.*;

public class Num1436 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int result = 666;
        int count = 1;
        while(input != count){
            result++;
            if(String.valueOf(result).contains("666")) count++;
        }

        System.out.println(result);
    }
}
