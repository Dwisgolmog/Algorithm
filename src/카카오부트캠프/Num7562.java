package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num7562 {

    static int[] knight = new int[2];
    static int[] goal = new int[2];
    static boolean[][] visited;
    static int[][] result;
    static int[] moveX = {-2,-1,1,2,2,1,-1,-2};
    static int[] moveY = {1,2,2,1,-1,-2,-2,-1};
    static int size = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++){
            size = Integer.parseInt(br.readLine());
            visited = new boolean[size][size];
            result = new int[size][size];

            st = new StringTokenizer(br.readLine());
            knight[0] = Integer.parseInt(st.nextToken());
            knight[1] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            goal[0] = Integer.parseInt(st.nextToken());
            goal[1] = Integer.parseInt(st.nextToken());

            bfs();
            sb.append(result[goal[0]][goal[1]]).append("\n");
        }

        System.out.println(sb);
    }

    public static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(knight);
        visited[knight[0]][knight[1]] = true;

        while(!queue.isEmpty()){
            int[] num = queue.poll();
            int x = num[0];
            int y = num[1];

            for(int i=0; i<8; i++){
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if(nextX >= 0 && nextY >= 0 && nextX<size && nextY<size){
                    if(!visited[nextX][nextY]){
                        queue.add(new int[]{nextX, nextY});
                        result[nextX][nextY] = result[x][y] + 1;
                        visited[nextX][nextY] = true;
                    }
                }
            }
        }
    }
}
