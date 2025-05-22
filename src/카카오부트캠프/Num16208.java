package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num16208 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        long[] list = new long[count];

        long sum = 0;
        long result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            list[i] = Long.parseLong(st.nextToken());
            sum += list[i];
        }

        for(int i=0; i<count; i++){
            sum -= list[i];
            result += list[i] * sum;
        }

        System.out.println(result);
    }
}
