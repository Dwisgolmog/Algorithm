package 일반수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2903 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 3;

        for(int i=1; i<num; i++){
            result += result-1;
        }

        System.out.println((int)(Math.pow(result,2)));
    }

}
