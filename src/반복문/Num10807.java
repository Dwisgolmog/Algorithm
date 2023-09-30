package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Num10807 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());
        int result =0;
        int[] numbers = new int[size];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<size; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int findNum = Integer.parseInt(br.readLine());

        for(int i=0; i<size; i++){
            if(numbers[i] == findNum) result ++;
        }

        System.out.println(result);
    }
}
