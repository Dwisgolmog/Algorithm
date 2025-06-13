package 백준.단계별로풀이.동적계획법1;

import java.io.*;
import java.util.*;

public class Num1932 {
    static int[][] map;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        map = new int[count+1][count+1];

        StringTokenizer st;
        for(int i=1; i<=count; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<i+1; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=2; i<=count; i++){
            for(int j=1; j<i+1; j++){
                map[i][j] += Math.max(map[i-1][j-1],map[i-1][j]);
            }
        }

        int result = 0;
        for(int i=0; i<=count; i++){
            if(result < map[count][i]) result = map[count][i];
        }

        System.out.println(result);
    }
}
