package 백준.단계별로풀이.동적계획법1;

import java.io.*;
import java.util.*;

public class Num1149 {
    static int[][] map;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        map = new int[count][3];

        StringTokenizer st;
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
            map[i][2] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<count; i++){
            map[i][0] = Math.min(map[i - 1][1], map[i - 1][2]) + map[i][0];
            map[i][1] = Math.min(map[i - 1][0], map[i - 1][2]) + map[i][1];
            map[i][2] = Math.min(map[i - 1][0], map[i - 1][1]) + map[i][2];
        }

        System.out.println(Math.min(Math.min(map[count-1][0],map[count-1][1]),map[count-1][2]));
    }
}
