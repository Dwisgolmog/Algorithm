package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1018 {

    static boolean[][] list;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        list = new boolean[y][x];

        for(int i=0; i<y; i++){
            char[] input = br.readLine().toCharArray();
            for(int j=0; j<x; j++){
                list[i][j] = input[j] == 'W';
            }
        }

        for(int i=0; i<y-7; i++){
            for(int j=0; j<x-7; j++){
                select(i,j);
            }
        }

        System.out.println(min);
    }

    public static void select(int y,int x){
        int count = 0;

        boolean check = list[y][x];
        for(int i=y; i<y+8; i++){
            for(int j=x; j<x+8; j++){
                if(list[i][j] != check) count++;

                check = !check;
            }
            check = !check;
        }

        count = Math.min(count,64-count);

        min = Math.min(min,count);
    }
}
