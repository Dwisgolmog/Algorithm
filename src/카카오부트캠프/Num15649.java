package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num15649 {

    static StringBuilder sb = new StringBuilder();
    static boolean[] visit;
    static int depth = 0;
    static int[] arr;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(N,M,depth);
        System.out.println(sb);
    }

    public static void dfs(int N,int M,int depth){
        if(depth == M){
            for(int val: arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N,M,depth+1);
                visit[i] = false;
            }
        }
    }
}
