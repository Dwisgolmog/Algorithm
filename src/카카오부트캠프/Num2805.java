package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2805 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int[] tree = new int[count];
        int left = 1;
        int right = 0;
        int mid = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num > right) right = num;
            tree[i] = num;
        }

        int result = 0;
        while(left <= right){
            mid = (left+right)/2;
            long sum = 0;

            for(int num : tree){
                if(num - mid >= 0) sum += num - mid;
            }

            if(sum >= total){
                result = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        System.out.println(result);

    }
}
