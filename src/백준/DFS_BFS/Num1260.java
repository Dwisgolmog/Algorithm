package 백준.DFS_BFS;

import java.io.*;
import java.util.*;

public class Num1260 {

    static int N; //정점의 개수
    static int M; //간선의 개수
    static int V; //탐색을 시작할 정점의 번호
    static boolean visited_arr[]; //방문한 정점
    static int edge_arr[][]; //방문한 간선
    static int count; //DFS 반복 횟수
    static Queue<Integer> que = new LinkedList<>();

    public static void DFS(int start){
        visited_arr[start] = true;
        System.out.print(start + " ");

        if(count == N) return;
        count++;

        for(int i=1; i<=N; i++){
            if (edge_arr[start][i] == 1 && visited_arr[i] == false) {
                DFS(i);
            }
        }
    }

    public static void BFS(int start){
        que.add(start);
        visited_arr[start] = true;
        System.out.print(start + " ");

        while(!que.isEmpty()){
            start = que.remove();

            for(int i=1; i<=N; i++){
                if(edge_arr[start][i] == 1 && visited_arr[i] == false){
                    que.add(i);
                    visited_arr[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited_arr = new boolean[1001];
        edge_arr = new int[1001][1001];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int firstVertex = Integer.parseInt(st.nextToken());
            int secondVertex = Integer.parseInt(st.nextToken());

            edge_arr[firstVertex][secondVertex] = edge_arr[secondVertex][firstVertex] = 1;
        }

        DFS(V);
        System.out.println();

        visited_arr = new boolean[1001];
        BFS(V);
    }
}
