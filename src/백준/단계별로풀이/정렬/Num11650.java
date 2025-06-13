package 백준.단계별로풀이.정렬;

import java.io.*;
import java.util.*;

public class Num11650 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        int[][] result = new int[count][2];

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            result[i][0] = Integer.parseInt(st.nextToken());
            result[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(result,(x,y) ->{
            if(x[0] == y[0]) return Integer.compare(x[1],y[1]);
            return Integer.compare(x[0],y[0]);
        });

        for(int[] num : result){
            sb.append(num[0]).append(" ").append(num[1]).append("\n");
        }

        System.out.println(sb);
    }
}
