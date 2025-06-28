package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num14940 {
    static int[][] map;
    static int[][] resultMap;
    static boolean[][] visited;
    static int n,m;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        resultMap = new int[n][m];
        visited = new boolean[n][m];

        int startN = 0;
        int startM = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2){
                    startN = i;
                    startM = j;
                }else if(map[i][j] == 0){
                    resultMap[i][j] = 0;
                    visited[i][j] = true;
                }else{
                    resultMap[i][j] = -1;
                }
            }
        }

        BFS(startN,startM);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sb.append(resultMap[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void BFS(int startN,int startM){
        int[] moveX = {-1,0,1,0};
        int[] moveY = {0,-1,0,1};

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{startN, startM});

        visited[startN][startM] = true;
        resultMap[startN][startM] = 0;

        while(!q.isEmpty()){
            int[] nextNum = q.poll();
            int y = nextNum[0];
            int x = nextNum[1];

            for(int i=0; i<4; i++){
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if(nextX >= 0 && nextX < m && nextY >= 0 && nextY < n &&
                        map[nextY][nextX] == 1 && !visited[nextY][nextX]){
                    resultMap[nextY][nextX] = resultMap[y][x]+1;
                    visited[nextY][nextX] = true;
                    q.add(new int[]{nextY, nextX});
                }
            }
        }
    }
}
