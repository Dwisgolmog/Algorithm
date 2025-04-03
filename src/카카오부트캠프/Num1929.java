package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1929 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i=startNum; i<=endNum; i++){
            int boolNum = 0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0) boolNum = 1;
            }

            if(i == 1) continue;
            if(boolNum == 0) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
