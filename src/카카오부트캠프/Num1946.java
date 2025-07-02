package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1946 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<testCase; i++){
            int count = Integer.parseInt(br.readLine());

            int[] point = new int[count+1];
            for(int j=0; j<count; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                point[a] = b;
            }

            int temp = point[1];
            int result = 1;
            for(int j=2; j<=count; j++){
                if(temp > point[j]){
                    result++;
                    temp = point[j];
                }
            }
            System.out.println(result);
        }
    }
}
