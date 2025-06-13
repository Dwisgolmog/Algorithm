package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3052 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];
        int count = 0;
        int result = 0;

        for(int i=0; i<10; i++){
            list[i] = Integer.parseInt(br.readLine())%42;
        }

        for(int i=0; i<10; i++){
            count = 0;
            for(int j=i+1; j<10; j++){
                if(list[i] == list[j]){
                    count++;
                }
            }
            if(count == 0) result++;
        }

        System.out.println(result);
    }
}