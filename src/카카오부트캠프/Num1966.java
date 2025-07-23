package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1966 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] result = new int[count];
        for(int i=0; i<count; i++){
            Queue<Integer[]> q = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            Integer[] list = new Integer[length];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<length; j++){
                int num = Integer.parseInt(st.nextToken());
                list[j] = num;
                if(j == index){
                    q.add(new Integer[] {num,1});
                }else{
                    q.add(new Integer[] {num,0});
                }
            }

            Arrays.sort(list,Collections.reverseOrder());

            int j = 0;
            while(true) {
                Integer[] num = q.poll();
                if (num[0] == list[j]){
                    result[i] += 1;
                    if(num[1] == 1) break;
                    j++;
                }else{
                    q.add(num);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }
}
