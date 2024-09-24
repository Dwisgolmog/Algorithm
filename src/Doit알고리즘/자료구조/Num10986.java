package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제 속도:416ms 코드길이:1026B
public class Num10986 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long A[] = new long[N+1];
        long S[] = new long[N];
        long C[] = new long[M];


        long result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<N+1; i++){
            A[i] = Integer.parseInt(st.nextToken()) + A[i-1];
        }

        for(int i=0; i<N; i++) {
            S[i] = A[i+1] % M;

            if(S[i] == 0) result++;

            C[(int)S[i]]++;
        }

        for(int i=0; i<M; i++){
            if(C[i] != 0) result += (C[i]*(C[i]-1)/2);
        }

        System.out.println(result);

    }
}
