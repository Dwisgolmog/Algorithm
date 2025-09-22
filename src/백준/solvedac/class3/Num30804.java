package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num30804 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int typeSize = Integer.parseInt(br.readLine());
        int[] arr = new int[typeSize];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<typeSize; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer,Integer> map = new HashMap<>();
        int l = 0, maxLen = 0;

        for(int r=0; r<typeSize; r++){
            map.put(arr[r],map.getOrDefault(arr[r],0) + 1);

            while(map.size() > 2){
                map.put(arr[l],map.get(arr[l]) - 1);
                if(map.get(arr[l]) == 0) map.remove(arr[l]);
                l++;
            }

            maxLen = Math.max(maxLen, r-l + 1);
        }

        System.out.println(maxLen);
    }
}
