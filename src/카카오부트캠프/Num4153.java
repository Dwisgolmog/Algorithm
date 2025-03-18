package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num4153 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int[] list = new int[3];

            list[0] = Integer.parseInt(st.nextToken());
            list[1] = Integer.parseInt(st.nextToken());
            list[2] = Integer.parseInt(st.nextToken());

            if(list[0] == 0 && list[1] == 0 && list[2] == 0) break;

            Arrays.sort(list);

            if(Math.pow(list[0],2) + Math.pow(list[1],2) == Math.pow(list[2],2)) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");
        }

        System.out.println(sb);
    }
}
