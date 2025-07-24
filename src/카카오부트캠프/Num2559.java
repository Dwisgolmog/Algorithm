package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2559 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] arr = new int[total];
        int[] sumArr = new int[total-count + 1];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<total; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i < count) sum += arr[i];
        }

        sumArr[0] = sum;
        int index = 1;
        for(int i=count; i<total; i++){
            sumArr[index] = sumArr[index-1] + arr[i] - arr[i-count];
            index++;
        }

        Arrays.sort(sumArr);

        System.out.println(sumArr[index-1]);
    }
}