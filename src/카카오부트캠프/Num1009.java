package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1009 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = 1;
            for(int j=0; j<b; j++){
                result *= a;
                result %= 10;
            }
            if(result == 0) sb.append(10).append("\n");
            else sb.append(result).append("\n");

        }

        System.out.println(sb);
    }
}
