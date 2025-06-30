package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2740 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        A = input(A,N,M);

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int K = Integer.parseInt(st.nextToken());
        int[][] B = new int[M][K];
        B = input(B,M,K);

        int[][] result = new int[N][K];
        for(int i=0; i<N; i++){
            for(int j=0; j<K; j++){
                int sum = 0;

                for(int c=0; c<M; c++){
                     sum += A[i][c]*B[c][j];
                }

                result[i][j] = sum;
            }
        }

        output(result,N,K);
    }

    public static int[][] input(int[][] arr,int y,int x)throws IOException{
        StringTokenizer st;

        for(int i=0; i<y; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<x; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        return arr;
    }

    public static void output(int[][] result,int N,int K){
        for(int i=0; i<N; i++){
            for(int j=0; j<K; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
