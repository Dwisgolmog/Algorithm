package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num11279 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(q.isEmpty()) sb.append(0).append("\n");
                else sb.append(q.remove()).append("\n");
            }else{
                q.add(num);
            }
        }

        System.out.println(sb);

    }
}
