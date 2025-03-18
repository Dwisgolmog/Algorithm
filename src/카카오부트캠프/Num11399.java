package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num11399 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] list = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        int[] sumList = new int[count];
        for(int i=0; i<count; i++){
            if(i == 0) {
                sumList[i] = list[i];
            }else{
                sumList[i] = sumList[i-1] + list[i];
            }
        }

        int result = 0;
        for(int i=0; i<count; i++){
            result += sumList[i];
        }

        System.out.println(result);
    }
}
