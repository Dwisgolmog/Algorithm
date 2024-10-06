package 백준.DFS_BFS;

import java.io.*;
import java.util.*;

public class Num2178 {

    public static boolean visited[][]; //미로에서 방문한 곳의 좌표
    public static  int[][] maze; //미로

    public static int N; //미로 Y의 크기
    public static int M; //미로 X의 크기
    public static Queue<Point> q;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        q = new LinkedList<>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<M; j++){
                maze[i][j] = Character.getNumericValue(ch[j]);
            }
        }

        BFS();
        System.out.println(maze[N-1][M-1]);
    }

    public static void BFS(){
        int[] moveX = {-1,1,0,0};
        int[] moveY = {0,0,-1,1};
        int x,y;

        visited[0][0] = true;
        q.add(new Point(0,0));

        while(!q.isEmpty()){
            Point p = q.remove();

            for(int i=0; i<4; i++){
               x = p.x + moveX[i];
               y = p.y + moveY[i];

               //미로의 크기 밖일경우 통과
               if(x < 0 || x>=M || y < 0 || y >=N) continue;

               //1이 아닌 0일 경우 또는 이미 검사한 곳일 경우 통과
               if(maze[y][x] == 0 || visited[y][x]) continue;

               q.add(new Point(x,y));
               maze[y][x] = maze[p.y][p.x] + 1;
               visited[y][x] = true;
            }
        }
    }

}

class Point{ //좌표를 담기 위해 사용될 클래스
    int x;
    int y;
    Point(int x ,int y){
        this.x = x;
        this.y = y;
    }
}
