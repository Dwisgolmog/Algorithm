package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num31575 {
    public static int[][] city;
    public static int[] moveX = {1,0};
    public static int[] moveY = {0,1};
    public static boolean[][] visited;
    public static int x;
    public static int y;
    public static String result = "No";

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        city = new int[y][x];
        visited = new boolean[y][x];

        for(int i=0; i<y; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<x; j++){
                city[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = true;
        dfs(0,0);
        System.out.println(result);
    }

    public static boolean dfs(int nextY,int nextX){
        if(nextX == x-1 && nextY == y-1){
            result = "Yes";
            return true;
        }

        for(int i=0; i<2; i++){
            int newY = nextY+moveY[i];
            int newX = nextX+moveX[i];
            if((newY >= 0) && (newY < y) && (newX >= 0) &&
                    (newX < x) && (city[newY][newX] == 1) && !visited[newY][newX]){
                visited[newY][newX] = true;
                if(dfs(newY,newX)) return true;
            }
        }

        return false;
    }
}
