package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num15652 {
    static int[] arr;
    static int M,N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(0,0);
        System.out.println(sb);
    }

    static void dfs(int num,int depth){
        if(M == depth){
            for(int value: arr){
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=num; i<N; i++){
            arr[depth] = i+1;
            dfs(i,depth+1);
        }
    }
}
