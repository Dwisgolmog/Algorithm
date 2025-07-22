package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num7569 {
    static int[] moveX = {0, 1, 0, -1, 0, 0};
    static int[] moveY = {-1, 0, 1, 0, 0, 0};
    static int[] moveTopDown = {0, 0, 0, 0, -1, 1};
    static Queue<int[]> q = new ArrayDeque<>();
    static ArrayList<Integer[][]> list = new ArrayList<>();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        for(int i=0; i<H; i++){
            Integer[][] arr = new Integer[N][M];
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                for(int c=0; c<M; c++){
                    int num = Integer.parseInt(st.nextToken());
                    arr[j][c] = num;
                    if(num == 1) q.add(new int[]{i, j, c,0}); // 높이,세로,가로,날짜
                }
            }
            list.add(arr);
        }

        int result = BFS(H,N,M);

        for(Integer[][] arr : list){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(arr[i][j] == 0){
                        result = -1;
                    }
                }
            }
        }

        System.out.println(result);
    }

    public static int BFS(int H,int N,int M){
        int result = 0;
        while(!q.isEmpty()){
            int[] num = q.poll();
            int day = num[3];
            result = Math.max(result,day);

            for(int i=0; i<6; i++){
                int nextTopDown = num[0] + moveTopDown[i];
                int nextY = num[1] + moveY[i];
                int nextX = num[2] + moveX[i];

                if (nextTopDown >= 0 && nextTopDown < H && nextY >= 0 && nextY < N && nextX >= 0 && nextX < M) {
                    if(list.get(nextTopDown)[nextY][nextX] == 0) {
                        list.get(nextTopDown)[nextY][nextX] = 1;
                        q.add(new int[] {nextTopDown,nextY,nextX,day+1});
                    }
                }
            }
        }

        return result;
    }
}
