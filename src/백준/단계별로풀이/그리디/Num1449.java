package 백준.단계별로풀이.그리디;

import java.util.*;
import java.io.*;

public class Num1449 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] pipe = new boolean[1001];
        int result = 0;

        int count = Integer.parseInt(st.nextToken());
        int tape = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] list = new int[count];
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            pipe[num] = true;
            list[i] = num;
        }

        Arrays.sort(list);

        for(int i=0; i<count; i++){
            int num = list[i];
            if(pipe[num]){
                result++;
                for(int j=0; j<tape; j++) {
                    if (num + j <= 1000) pipe[num + j] = false;
                }
            }

        }

        System.out.println(result);
    }
}
