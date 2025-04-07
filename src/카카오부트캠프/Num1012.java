package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1012 {
    static int[][] ground;
    static boolean[][] check;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int c=0; c<count; c++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int napaCabbage = Integer.parseInt(st.nextToken());

            ground = new int[x][y];
            check = new boolean[x][y];
            for(int i=0; i<napaCabbage; i++){
                st = new StringTokenizer(br.readLine());
                ground[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int result = 0;
            for(int i=0; i<x; i++){
                for(int j=0; j<y; j++){
                    if(ground[i][j] == 1 && !check[i][j]){
                        bfs(i,j);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }


    }

    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        check[x][y] = true;

        int[] moveX = {0,0,-1,1};
        int[] moveY = {-1,1,0,0};

        while(!queue.isEmpty()){
            int[] num = queue.poll();

            for(int i=0; i<4; i++){
                int X = num[0] + moveX[i];
                int Y = num[1] + moveY[i];

                if(X < 0 || X >= ground.length || Y < 0 || Y >= ground[0].length) continue;

                if(ground[X][Y] == 1 && !check[X][Y]){
                    queue.add(new int[] {X,Y});
                    check[X][Y] = true;
                }
            }
        }
    }
}
