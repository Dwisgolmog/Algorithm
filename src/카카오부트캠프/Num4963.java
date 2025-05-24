package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num4963 {

    static int[][] map;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();
    static int[] moveX = {-1,0,1,-1,1,-1,0,1};
    static int[] moveY = {-1,-1,-1,0,0,1,1,1};

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x == 0 && y == 0) break;

            map = new int[y][x];
            visited = new boolean[y][x];

            for(int i=0; i<y; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<x; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            bfs(x,y);
        }

        System.out.println(sb);
    }

    public static void bfs(int maxX,int maxY){
        Queue<int[]> q = new ArrayDeque<>();
        int result = 0;

        for(int i=0; i<maxY; i++){
            for(int j=0; j<maxX; j++){
                if(map[i][j] == 0 || visited[i][j]) continue;
                q.add(new int[]{j,i});
                visited[i][j] = true;

                while(!q.isEmpty()){
                    int[] num = q.poll();
                    for(int c=0; c<8; c++){
                        int newX = num[0] + moveX[c];
                        int newY = num[1] + moveY[c];

                        if(newX >= 0 && newY >= 0 && newX < maxX && newY < maxY &&
                                !visited[newY][newX] && map[newY][newX] == 1){
                            visited[newY][newX] = true;
                            q.add(new int[]{newX, newY});
                        }
                    }
                }
                result++;
            }
        }

        sb.append(result).append("\n");
    }
}
