package 일반수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2292 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roomNumber = Integer.parseInt(br.readLine());
        int sum = 1;
        int i=1;
        while(sum<roomNumber){
            sum += i*6;
            i++;
        }
        System.out.println(i);
    }
}
