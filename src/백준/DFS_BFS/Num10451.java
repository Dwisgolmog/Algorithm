package 백준.DFS_BFS;

import java.io.*;
import java.util.*;
public class Num10451 {

    public static int N; //정점의 갯수
    public static int[][] vertex; //정점들
    public static int[][] edge; //간선들
    public static boolean visited[]; //방문의 여부
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i=0; i<T; i++){
            N = Integer.parseInt(br.readLine());
            visited = new boolean[N+1];

            vertex = new int[2][N+1];
            edge = new int[N+1][N+1];

            st = new StringTokenizer(br.readLine());
            count = 0;

            for(int j=1; j<N+1; j++){
                int num = Integer.parseInt(st.nextToken());

                vertex[0][j] = j;
                vertex[1][j] = num;
                edge[num][j] = edge[j][num] = 1;
            }

            for(int j=1; j<N+1; j++){
                if(visited[j]) continue;
                DFS(j);
                count++;
            }
            System.out.println(count);
        }

    }

    public static void DFS(int start){
        visited[start] = true;

        for(int i=1; i<N+1; i++){
            if(edge[start][i] == 1 && !visited[i]){
                DFS(i);
            }
        }
    }

}
