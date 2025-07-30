package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num16401 {

    static int[] arr;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int children = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int max = 0;
        arr = new int[length];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max) max = arr[i];
        }

        System.out.println(binarySearch(children,max));
    }

    public static int binarySearch(int children,int max){
        int left = 1;
        int right = max;
        int result = 0;

        while(left <= right){
            int count = 0;
            int mid = (left+right) / 2;

            for(int i=0; i<arr.length; i++){
                 count += arr[i]/mid;
            }

            if(count >= children){
                left = mid + 1;
                result = mid;
            }else{
                right = mid - 1;
            }
        }

        return result;
    }
}
