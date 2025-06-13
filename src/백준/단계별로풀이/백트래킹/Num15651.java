package 백준.단계별로풀이.백트래킹;

import java.io.*;
import java.util.*;

public class Num15651 {

    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        DFS(0);
        System.out.println(sb);
    }

    public static void DFS(int depth){
        if(depth == M) {
            for(int value: arr) sb.append(value).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=1; i<=N; i++){
            arr[depth] = i;
            DFS(depth+1);
        }
    }
}
