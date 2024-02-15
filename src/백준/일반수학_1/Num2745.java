package 일반수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2745 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = 0;
        char c;
        int count = 0;
        int number = 0;

        for(int i=N.length()-1; i>=0; i--){
            c = N.charAt(i);
            if(c >= '0' && c <= '9'){
                number = c - '0';
            }else{
                number = c - 55;
            }
            result += (int) (number * Math.pow(B,count++));
        }

        System.out.println(result);
    }
}

