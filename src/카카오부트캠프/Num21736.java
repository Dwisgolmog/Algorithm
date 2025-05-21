package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num21736 {

    static char[][] map;
    static boolean[][] visited;
    static int[] moveX = {-1,1,0,0};
    static int[] moveY = {0,0,-1,1};
    static int result = 0;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        map = new char[y][x];
        visited = new boolean[y][x];

        int[] doyeon = new int[2];
        for(int i=0; i<y; i++){
            String str = br.readLine();
            int index = str.indexOf("I");
            if(index != -1) doyeon = new int[]{i, index};
            map[i] = str.toCharArray();
        }

        bfs(doyeon);

        if(result == 0) System.out.println("TT");
        else System.out.println(result);
    }

    public static void bfs(int[] doyeon){
        Queue<int[]> q = new ArrayDeque<>();
        int y = doyeon[0];
        int x = doyeon[1];
        q.add(new int[]{y,x});
        visited[y][x] = true;

        while(!q.isEmpty()){
            int[] num = q.poll();

            for(int i=0; i<4; i++){
                int newY = num[0] + moveY[i];
                int newX = num[1] + moveX[i];
                if(newY >=0 && newX >= 0 && newY < map.length && newX < map[0].length &&
                        !visited[newY][newX] &&  map[newY][newX] != 'X'){
                    q.add(new int[]{newY,newX});
                    visited[newY][newX] = true;
                    if(map[newY][newX] == 'P') result++;
                }
            }
        }
    }
}
