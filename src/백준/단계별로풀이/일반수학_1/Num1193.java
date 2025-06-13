package 백준.단계별로풀이.일반수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1193 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int cross = 1;
        int prev_sum = 0;

        while(true){
            if(count <= prev_sum + cross){
                if(cross%2 == 0){
                    System.out.println((count-prev_sum)+"/"+(cross-(count-prev_sum-1)));
                    break;
                }else{
                    System.out.println((cross-(count-prev_sum-1))+"/"+(count-prev_sum));
                    break;
                }
            }else{
                prev_sum += cross;
                cross++;
            }
        }
    }
}
