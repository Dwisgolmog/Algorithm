package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제 속도:572ms 코드길이:987B
public class Num11659 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int dataCount = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] sumArray = new int[dataCount+1];

        st = new StringTokenizer(br.readLine());

        for(int i=1; i<dataCount+1; i++){
            sumArray[i] = Integer.parseInt(st.nextToken()) + sumArray[i-1];
        }

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(sumArray[b] - sumArray[a - 1]).append('\n');
        }

        System.out.println(sb);
    }
}
