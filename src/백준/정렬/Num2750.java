package 백준.정렬;

import java.io.*;
import java.util.Arrays;

public class Num2750 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numArray[] = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            int num = Integer.parseInt(br.readLine());
            sum += num;
            numArray[i] = num;
        }
        Arrays.sort(numArray);
        System.out.println(sum/5);
        System.out.println(numArray[2]);
    }
}
