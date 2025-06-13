package 백준.단계별로풀이.약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1978 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());

        int number = 0;
        int result = 0;
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<count; i++){
            number = Integer.parseInt(st.nextToken());

            if(number == 1) result++;
            for(int j=2; j<=Math.sqrt(number); j++){
                if(number%j == 0){
                    result++;
                    break;
                }
            }
        }

        System.out.println(count - result);
    }

}
