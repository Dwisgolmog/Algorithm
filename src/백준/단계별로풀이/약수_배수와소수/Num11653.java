package 백준.단계별로풀이.약수_배수와소수;

import java.io.*;
import java.lang.Math;

public class Num11653 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int value =input;

        StringBuilder sb = new StringBuilder();
        for(int i=2; i<= Math.sqrt(input); i++){
            if(value % i == 0){
                value = value/i;
                sb.append(i).append("\n");
                i = 1;
            }
        }
        if(value != 1) sb.append(value);
        System.out.println(sb);
    }
}
