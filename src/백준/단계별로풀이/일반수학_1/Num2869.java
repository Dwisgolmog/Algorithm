package 백준.단계별로풀이.일반수학_1;

import java.io.*;
import java.util.StringTokenizer;

public class Num2869 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V-B) / (A-B);

        if((V-B) % (A-B) != 0){
            day++;
        }
        System.out.println(day);
    }

}
