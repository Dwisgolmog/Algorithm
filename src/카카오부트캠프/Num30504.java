package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num30504 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        Integer[] index = new Integer[count];
        int[] arr1 = new int[count];
        int[] arr2 = new int[count];

        for(int i=0; i<count; i++){
            arr1[i] = Integer.parseInt(st1.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> Integer.compare(arr1[a], arr1[b]));
        Arrays.sort(arr2);

        int[] result = new int[count];
        for(int i=0; i<count; i++){
            result[index[i]] = arr2[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            if(result[i] >= arr1[i]) sb.append(result[i]).append(" ");
            else{
                System.out.println(-1);
                return;
            }
        }

        System.out.println(sb);
    }
}
