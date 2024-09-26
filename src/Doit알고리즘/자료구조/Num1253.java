package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1253 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int result = 0;

        for(int i=0; i<N; i++){
            int start_point = 0;
            int end_point = N-1;

           while(start_point < end_point){
                if(start_point == i){
                    start_point++;
                    continue;
                }else if(end_point == i){
                    end_point--;
                    continue;
                }

                int sum = A[start_point] + A[end_point];

                if(sum == A[i]){
                    result++;
                    break;
                } else if (sum > A[i]) {
                    end_point--;
                } else {
                    start_point++;
                }

            }
        }

        System.out.println(result);
    }
}
