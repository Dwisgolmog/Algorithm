package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num15650 {

    static int[] arr;
    static boolean[] visit;
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        DFS(0,0);

        System.out.println(sb);
    }

    public static void DFS(int num,int depth){
        if(M == depth){
            for(int val: arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=num; i<N; i++){
            arr[depth] = i + 1;
            DFS(i+1,depth+1);
        }
    }
}
