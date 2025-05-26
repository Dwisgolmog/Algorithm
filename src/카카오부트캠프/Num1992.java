package 카카오부트캠프;

import java.io.*;

public class Num1992 {
    static int[][] map;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        map = new int[size][size];

        for(int i=0; i<size; i++){
            String input = br.readLine();
            for(int j=0; j<size; j++){
                map[i][j] = input.charAt(j) - '0';
            }
        }
        divide(new int[]{0, 0},new int[]{size,size});
        System.out.println(sb);
    }

    public static void divide(int[] start,int[] end){
        int prev = map[start[1]][start[0]];

        for(int i=start[1]; i<end[1]; i++){
            for(int j=start[0]; j<end[0]; j++){
                if(prev != map[i][j]){
                    sb.append("(");
                    int midX = (start[0] + end[0]) / 2;
                    int midY = (start[1] + end[1]) / 2;

                    divide(new int[]{start[0], start[1]}, new int[]{midX, midY});
                    divide(new int[]{midX, start[1]}, new int[]{end[0], midY});
                    divide(new int[]{start[0], midY}, new int[]{midX, end[1]});
                    divide(new int[]{midX, midY}, new int[]{end[0], end[1]});
                    sb.append(")");
                    return;
                }
            }
        }

        sb.append(prev);
        return;
    }
}
