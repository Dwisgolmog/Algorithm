package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());
        int[] index = new int[N];

        for(int i=0;i<N; i++){
            index[i] = i+1;
        }

        int start_index =0;
        int end_index =0;
        int count =1;
        int sum = 1;

        while(start_index < N-1){
            if(sum < N){
                start_index++;
                sum += index[start_index];
            } else if (sum > N) {
                sum -= index[end_index];
                end_index++;
            } else if (sum == N) {
                count++;
                start_index++;
                sum += index[start_index];
            }
        }

        System.out.println(count);

    }
}
