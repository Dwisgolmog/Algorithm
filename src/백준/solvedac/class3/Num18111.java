package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num18111 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int block = Integer.parseInt(st.nextToken());

        int[][] map = new int[y][x];
        int min = 256;
        int max = 0;

        for(int i=0; i<y; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<x; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min,map[i][j]);
                max = Math.max(max,map[i][j]);
            }
        }

        int resultTime = Integer.MAX_VALUE;
        int resultHeight = 0;

        for(int h=min; h<=max; h++){
            int time = 0;
            int inven = block;

            for(int i=0; i<y; i++){
                for(int j=0; j<x; j++){
                    int sub = map[i][j] - h;

                    if(sub > 0){
                        time += sub*2;
                        inven += sub;
                    }else if(sub < 0){
                        time += (-sub);
                        inven += sub;
                    }
                }
            }

            if(inven >= 0){
                if(time < resultTime || (time == resultTime && h > resultHeight)){
                    resultTime = time;
                    resultHeight = h;
                }
            }
        }

        System.out.println(resultTime+" "+resultHeight);

    }
}
